package vikram;
import java.util.Scanner;
public class Volofcylinder {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float pi=3.14f;
		System.out.println("Enter R");
		int r=sc.nextInt();
		System.out.println("Enter H");
		int h=sc.nextInt();
		float Vol=pi*r*r*h;
		System.out.println(Vol);
	}

}
//vol=pi*r^2*(h);//