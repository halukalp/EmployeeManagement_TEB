package tr.com.teb.bt.employee_app.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import tr.com.teb.bt.employee_app.model.entity.Employee;
import tr.com.teb.bt.employee_app.model.repository.EmployeeRepository;

import java.util.List;

public abstract class AbstractEmployeeService implements EntityService<Employee, Integer>
{
    @Autowired
    protected EmployeeRepository employeeRepository;

    protected abstract List<Employee> findBySalaryLessThan(double salary);

    protected abstract List<Employee> findBySalaryGreaterThanEqual(double salary);
}
