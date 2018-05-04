
public class Person {
	private String firstName;
	private String surName;
	private String homeAddress;
	private String homeAreaCode;
	private String homePhoneNumber;
	private String officeAddress;
	private String officePhoneNumber;
	private String mobileAreaCode;
	private String mobilePhoneNumber;
	
	public Person(String firstName, String surName, String homeAddress, String homeAreaCode, String homePhoneNumber,
			String officeAddress, String officePhoneNumber, String mobileAreaCode, String mobilePhoneNumber) {
		this.firstName = firstName;
		this.surName = surName;
		this.homeAddress = homeAddress;
		this.homeAreaCode = homeAreaCode;
		this.homePhoneNumber = homePhoneNumber;
		this.officeAddress = officeAddress;
		this.officePhoneNumber = officePhoneNumber;
		this.mobileAreaCode = mobileAreaCode;
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getHomeAreaCode() {
		return homeAreaCode;
	}
	public void setHomeAreaCode(String homeAreaCode) {
		this.homeAreaCode = homeAreaCode;
	}
	public String getMobileAreaCode() {
		return mobileAreaCode;
	}
	public void setMobileAreaCode(String mobileAreaCode) {
		this.mobileAreaCode = mobileAreaCode;
	}
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}
	public String getOfficePhoneNumber() {
		return officePhoneNumber;
	}
	public void setOfficePhoneNumber(String officePhoneNumber) {
		this.officePhoneNumber = officePhoneNumber;
	}
	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}
	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}
	
}
