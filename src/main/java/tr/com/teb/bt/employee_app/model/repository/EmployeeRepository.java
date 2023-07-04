package tr.com.teb.bt.employee_app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.teb.bt.employee_app.model.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    // SELECT * FROM EMPLOYEES WHERE SALARY < ?;
    List<Employee> findBySalaryLessThan(double salary);



    // SELECT * FROM EMPLOYEES WHERE SALARY >= ?;
    List<Employee> findBySalaryGreaterThanEqual(double salary);
}
