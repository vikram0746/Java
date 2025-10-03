package classobj;

import java.util.Scanner;

public class Math {
	static int add(int a,int b) {
		return a+b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static double div(int a,int b) {
		return b/a;
	}
	static int sound() {
		int a=10;
		int b=77;
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Addition: "+Math.add(a,b));
		System.out.println("Multiply: "+Math.mul(a,b));
		System.out.println("Subract: "+Math.sub(a,b));
		System.out.println("Divide: "+Math.div(a,b));
		System.out.println(sound());
	}

}
