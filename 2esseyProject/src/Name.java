
public class Name extends Person {

	public Name(String firstName, String surName) {
		super(firstName, surName, null);
	}

	@Override
	public String toString() {
		return "Name [toString()=" + super.toString() + "]";
	}

}
