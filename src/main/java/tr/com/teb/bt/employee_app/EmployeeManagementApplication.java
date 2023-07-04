package tr.com.teb.bt.employee_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.com.teb.bt.employee_app.model.entity.Employee;

@SpringBootApplication
public class EmployeeManagementApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	public static void testLombok() {
		Employee employee1 = new Employee();
		employee1.setEmployeeID(-5542);

		System.out.println( employee1.toString() );
	}
}
