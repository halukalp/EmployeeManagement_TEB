package tr.com.teb.bt.employee_app.model.service;

import org.springframework.dao.OptimisticLockingFailureException;
import tr.com.teb.bt.employee_app.model.entity.Employee;
import tr.com.teb.bt.employee_app.utility.Util;

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
    public Employee insert(Employee entity)
    {
        try
        {
            return employeeRepository.save(entity);
        }
        catch (IllegalArgumentException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
        catch (OptimisticLockingFailureException e)
        {
            Util.showGeneralExceptionInfo(e);
            return null;
        }
    }
}
