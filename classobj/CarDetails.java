package classobj;

public class CarDetails {
	String brand ="";
	String color="";
	int price =0;
	int year=0;
	
	
	public static void main(String[] args) {
		CarDetails name=new CarDetails();
		name.brand="Audi";
		CarDetails vannam=new CarDetails();
		vannam.color="red";
		
		System.out.println(name.brand);
		System.out.println(vannam.color);
		
	}

}
