package vikram;
import java.util.Scanner;
public class Surfacearea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter B");
		int b=sc.nextInt();
		System.out.println("Enter H");
		int h=sc.nextInt();
		System.out.println("Enter L");
		int l=sc.nextInt();
		int TSA=2*(b*h+h*l+l*b);
		System.out.println(TSA);
	}

}

