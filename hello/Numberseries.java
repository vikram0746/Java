package hello;
import java.util.Scanner;
public class Numberseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		// for(int i=1;i<=100;i++) //
			if(a==1 && b==2) {
				System.out.println("natural num");
			}
			else if(a==1 && b==3){
				System.out.println("odd");
			}
			else {
				System.out.println("even");
			}
		}
	}

/*Write the program to find following number series.(without using if)
1+2+3+……+n=? natural numbers
1+3+5+…..+n=? odd
2+4+6+……+n=?even */






