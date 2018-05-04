
public class Employee extends University {

	public Employee(String name, int id, float annualCost) {
		super(name, id, annualCost);

	}

	@Override
	public String toString() {
		return "Employee: name:" + getName() + ", ID:" + getId() + ", Annual Cost:" + getAnnualCost();
	}

}
