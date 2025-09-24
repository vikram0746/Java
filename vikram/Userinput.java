package vikram;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value");
		int a=sc.nextInt();
		
		System.out.println("Enter long value");
		long b=sc.nextLong();
		
		System.out.println("Enter float value");
		float c = sc.nextFloat();
		
		System.out.println("Enter double value");
		double d=sc.nextDouble();
		
		System.out.println("enter short value");
		short e = sc.nextShort();
		
		System.out.println("Enter char value");
		char f= sc.next().charAt(0);
		
		System.out.println("Enter String value");
		String g = sc.next();
		
		System.out.println("Enter boolean value");
		boolean h = sc.nextBoolean();
		
		System.out.println("int"+a);
		System.out.println("long"+b);
		System.out.println("float"+c);
		System.out.println("double"+d);
		System.out.println("short"+e);
		System.out.println("char"+f);
		System.out.println("string"+g);
		System.out.println("boolean"+h);
	}

}
