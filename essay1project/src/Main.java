
public class Main {

	public static void main(String[] args) {
		Department dep1 = new Department("Ikta", 1);
		System.out.println(dep1);
		dep1.setAnnualCost(13.2f);
		System.out.println(dep1);
		System.out.println(new Employee("Her", 1, 52.8f));
	}
}