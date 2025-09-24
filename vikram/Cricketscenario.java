package vikram;
import java.util.Scanner;
public class Cricketscenario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balls faced by batsman:");
		int balls=sc.nextInt();
		if(balls==0) {
			System.out.println("Diamond duck");
		}
		else if(balls==1) {
			System.out.println("Golden duck");
		}
		else if(balls>=2) {
			System.out.println("Duck out");
		}
	}
	
	
}
