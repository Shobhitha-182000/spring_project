package spring_prc_employee_dto.property;

public class Employee {
	String name;
	int age;
	String address;
	long phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void print() {
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("address "+address);
		System.out.println("phone "+phone);
	}
	 
}
