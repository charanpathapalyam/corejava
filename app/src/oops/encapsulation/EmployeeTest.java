package oops.encapsulation;

public class EmployeeTest {
public static void main(String[] args) {
	Employee emp = new Employee();
	
	System.out.println(emp.getEmpId());
	
	emp.setEmpId(328);
	
	System.out.println(emp.getEmpId());
	

	emp.setEmail("charan@email.com");
	
	emp.setDesigniation("DEVELOPER");
	
	System.out.println(emp.getEmail());
	
	System.out.println(emp.getDesigniation());
   }
}
