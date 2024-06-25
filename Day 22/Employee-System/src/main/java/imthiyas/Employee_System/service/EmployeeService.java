package imthiyas.Employee_System.service;

import imthiyas.Employee_System.entity.Employee;
import imthiyas.Employee_System.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repo;
    public void addEmployee(Employee employee){
    repo.save(employee);
    }

    public List<Employee> getAllEmployee(){
       return repo.findAll();
    }
    public Employee getEmployeeById(int id){
        Optional<Employee> employee =repo.findById(id);
        if (employee.isPresent())
        {
            return employee.get();
        }
        return null;
    }
    public void deleteEmployee(int id){
        repo.deleteById(id);
    }
}
