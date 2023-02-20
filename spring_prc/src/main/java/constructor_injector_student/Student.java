package constructor_injector_student;

public class Student {
	private String name;
	private long phone;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(String name, long phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
}
