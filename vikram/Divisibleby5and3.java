package vikram;
import java.util.Scanner;
public class Divisibleby5and3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		
		if(a%5==0 &&a%3==0) {
			System.out.println("It is divisible by 5 & 3");
		}
		else if(a%5==0) {
		System.out.println("It is divisible by 5");
		}
		else if(a%3==0) {
			System.out.println("It is divisible by 3");
		}
	}
}
