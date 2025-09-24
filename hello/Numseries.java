package hello;

import java.util.Scanner;

public class Numseries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("+");
		int b=sc.nextInt();
		System.out.print("+");
		int c=sc.nextInt();
		System.out.print("+.....+n");
			if(a==1&&b==2) {
				System.out.println("natural numbers");
			}
			else if(a==1&&b==3) {
				System.out.println("Odd");
			}
			else {
				System.out.println("Even");
			}
		}
	

}





/*Write the program to find following number series.(without using if)
1+2+3+……+n=? natural numbers
1+3+5+…..+n=? odd
2+4+6+……+n=?even */


