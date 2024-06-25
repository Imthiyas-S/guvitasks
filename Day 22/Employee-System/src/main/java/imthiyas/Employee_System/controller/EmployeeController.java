package imthiyas.Employee_System.controller;

import imthiyas.Employee_System.entity.Employee;
import imthiyas.Employee_System.service.EmployeeService;
import jakarta.annotation.Nullable;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller


public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String home(Model m){
      List<Employee> employee= service.getAllEmployee();
        m.addAttribute("employee",employee);
        return "index";
    }
    @GetMapping("/add employee")
    public String addEmployeeForm(){
        return "add_employee";
    }
    @PostMapping("/register")
    public String employeeRegister(@ModelAttribute Employee employee, HttpSession session){
        System.out.println(employee);
        service.addEmployee(employee);
        session.setAttribute("successMsg","Employee Added Successfully!");

        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id,Model m){
        Employee employee = service.getEmployeeById(id);
        m.addAttribute("employee",employee);
        return "edit";
    }
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee,HttpSession session){
        service.addEmployee(employee);
        session.setAttribute("successMsg","Employee Data Update Successfully!..");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id, HttpSession session){

        service.deleteEmployee(id);
        session.setAttribute("successMsg","Employee Data Deleted Successfully!..");
        return "redirect:/";
    }
}
