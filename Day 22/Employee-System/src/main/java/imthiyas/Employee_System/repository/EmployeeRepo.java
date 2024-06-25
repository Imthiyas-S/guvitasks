package imthiyas.Employee_System.repository;

import imthiyas.Employee_System.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepo  extends JpaRepository<Employee, Integer> {
}
