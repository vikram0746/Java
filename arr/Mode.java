package arr;
import java.util.Scanner;
public class Mode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int a[]=new int[s];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j]==a[i]) {
					System.out.println("duplicate values"+a[i]);
				}
		}
		}
		
	}
	
	
}
//Mode - Duplicate values
