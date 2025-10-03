package classobj;

public class Employee {
	private String name;
	private Double salary;
	
	
	public void setname(String n) {
		name=n;
	}
	public String getname () {
		return name;
	}
	public void setsalary(Double s) {
		salary=s;
	}
	public Double getsalary () {
		return salary;
	}

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setname("vikram");
		obj.setsalary(50000.0);
		System.out.println(obj.getname()+" "+obj.getsalary());
		
	}
}


/*
 * Employee class: private variables: name, salary.
 * 
 * Public getters and setters implement செய்யவும்.
 * 
 * Main-ல் object உருவாக்கி, salary update செய்து print செய்யவும்.
 */