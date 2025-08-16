package EmployeeProject.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", repository.findAll());
        return "index";
    }
    @GetMapping("/show")
    public String viewShowPage(Model model) {
        model.addAttribute("listEmployees", repository.findAll());
        return "show";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "form";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        repository.save(employee);
        return "redirect:show";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Employee employee = repository.findById(id).orElse(null);
        model.addAttribute("employee", employee);
        return "form";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {
        repository.deleteById(id);
        return "show";
    }
}
