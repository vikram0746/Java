package arr;
import java.util.Scanner;
public class Palendrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array: ");
		int a=sc.nextInt();
		sc.nextLine();
		String s[]= new String[a];
		System.out.print("Enter the string: ");
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextLine();
		}
		boolean ispalendrome=true;
		for(int i=0;i<a/2;i++) {
			if(!s[i].equals (s[a-1-i])) {
				ispalendrome=false;
			}
		}
		if(ispalendrome) {
			System.out.println("palendrome");
		}
		else {
			System.out.println("not a palendrome");
		}
	}

}
