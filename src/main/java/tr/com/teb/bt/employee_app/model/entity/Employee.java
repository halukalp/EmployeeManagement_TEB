package tr.com.teb.bt.employee_app.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@SequenceGenerator(name = "EMPLOYEE_SEQUENCE", sequenceName = "TEB_EMPLOYEES_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "EMPLOYEES")
@Entity
public class Employee extends Object
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SEQUENCE")
    @Column(name = "EMPLOYEE_ID")
    @Id
    private int employeeID;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "HIRE_DATE")
    private Date hireDate;

    private double salary;

    public void setEmployeeID(int employeeID)
    {
        if (employeeID < 0)
        {
            System.err.println("ID must be positive.");
        }
        else
        {
            this.employeeID = employeeID;
        }
    }

    @Override
    public String toString()
    {
        return
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary;
    }
}
