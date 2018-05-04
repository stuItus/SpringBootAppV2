
public class University {
	private String name;
	private int id;
	private float annualCost;

	public University(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public University(String name, int id, float annualCost) {
		this.name = name;
		this.id = id;
		this.annualCost = annualCost;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public float getAnnualCost() {
		return annualCost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAnnualCost(float annualCost) {
		this.annualCost = annualCost;
	}

	// Other methods
}
