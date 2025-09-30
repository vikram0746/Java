package classobj;

public class Student {
	String feild="";
	String name="";
	int marks=0;
	void display() {
		System.out.println("Dept: "+feild+" name: "+name+" mark: "+marks);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Student no1=new Student();
		no1.feild="ECE";
		no1.name="Soundarya";
		no1.marks=98;
		Student no2=new Student();
		no2.feild="ECE";
		no2.name="Vikram";
		no2.marks=81;
		System.out.println();
		
		no1.display();
		no2.display();
	}

}
