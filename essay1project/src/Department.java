
public class Department extends University {

	public Department(String name, int id) {
		super(name, id);
	}

	@Override
	public float getAnnualCost() {
		return super.getAnnualCost() * 12;
	}

	@Override
	public String toString() {
		return "Department: name:" + getName() + ", ID:" + getId() + ", Annual Cost:" + getAnnualCost();
	}

}
