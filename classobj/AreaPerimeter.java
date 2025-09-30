package classobj;

import java.util.Scanner;

public class AreaPerimeter {
	Scanner sc=new Scanner(System.in);
	int h=sc.nextInt();
	int b=sc.nextInt();
	
	void area() {
		System.out.println("Area: "+h*b);
	}
	void perimeter() {
		System.out.println("perimeter: "+2*(h*b));
	}
	
	public static void main(String[] args) {
		
		/*
		 * Scanner sc=new Scanner(System.in); int h=sc.nextInt(); int b=sc.nextInt();
		 */
		 AreaPerimeter a=new  AreaPerimeter ();
		 /*Scanner sc=new Scanner(System.in);
			int h=sc.nextInt();
			int b=sc.nextInt();
			*/
		 a.area();
			a.perimeter();
	}

}
