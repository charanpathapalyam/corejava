package oops.encapsulation;

public class Employee {

	private int empId;
	private String email;
	private String designiation;
	private Double salary;
	private String address;
	
	// setters and getters 
	public int getEmpId() {          //To access directly into another classes we can  use setters and getters methods 
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesigniation() {
		return designiation;
	}
	public void setDesigniation(String designiation) {
		this.designiation = designiation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

 }
