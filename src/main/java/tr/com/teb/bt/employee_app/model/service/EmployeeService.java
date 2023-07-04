package tr.com.teb.bt.employee_app.model.service;

import tr.com.teb.bt.employee_app.model.entity.Employee;

import java.util.List;

public class EmployeeService extends AbstractEmployeeService
{

    @Override
    protected List<Employee> findBySalaryLessThan(double salary) {
        return null;
    }

    @Override
    protected List<Employee> findBySalaryGreaterThanEqual(double salary) {
        return null;
    }

    @Override
    public Employee update(Employee entity) {
        return null;
    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public Employee findByID(Integer id) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Employee insert(Employee entity) {
        return null;
    }
}
