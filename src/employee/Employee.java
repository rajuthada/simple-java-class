package employee;

/**
 * 
 * Employee class
 *
 */
public class Employee {
	/**
	 * Id of the employee.
	 */
	private int id;
	/**
	 * Name of the employee.
	 */
	private String name;
	/**
	 * Pay of the employee.
	 */
	private double pay;

	/**
	 * Id of the employee
	 * 
	 * @return Id of this employee.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Changes the id of this employee.
	 * 
	 * @param id new value for this employee's id.
	 */

	public void setId(int id) {
		this.id = id;

	}

	/**
	 * Name of this employee.
	 * 
	 * @return Name of this employee.
	 */

	public String getName() {
		return name;
	}

	/**
	 * Changes the name of this employee.
	 * 
	 * @param name new value for this employee's name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Pay of this employee.
	 * 
	 * @return pay of this employee.
	 */
	public double getPay() {
		return pay;
	}

	/**
	 * Changes the pay of this employee.
	 * 
	 * @param pay new value for this employee's pay.
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}

	/**
	 * Returns the string representation of this employee.
	 */
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.pay;

	}

}
