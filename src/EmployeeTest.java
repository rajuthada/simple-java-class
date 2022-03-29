import java.util.HashSet;
import java.util.Set;

import employee.Employee;

/**
 * 
 * EmployeeTest which contains logic to test Employee class
 *
 */
public class EmployeeTest {
	public static void main(String args[]) {
		// Create an object (e1) of Employee class
		Employee e1 = new Employee();
		// Set employee details
		e1.setId(111);
		e1.setName("John Doe");
		e1.setPay(1000000.0);

		// Create an object (e2) of Employee class
		Employee e2 = new Employee();
		// Set employee details
		e2.setId(222);
		e2.setName("Nancy Birkhead");
		e2.setPay(111111.0);
		
		// Create an object (e3) of Employee class
		Employee e3 = new Employee();
		// Set employee details
		e3.setId(111);
		e3.setName("Will Smith");
		e3.setPay(222222.0);
		
		
		// Add these objects to HashSet
		Set<Employee> employeeSet = new HashSet<Employee>();
		
		employeeSet.add(e1);
		employeeSet.add(e1); // duplicate
		employeeSet.add(e2);
		employeeSet.add(e3);
		
		System.out.print(employeeSet); // [111 John Doe 1000000.0, 222 Nancy Birkhead 111111.0, 111 Will Smith 222222.0]
		

	}

}
