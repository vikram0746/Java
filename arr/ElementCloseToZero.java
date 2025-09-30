package arr;

import java.util.Arrays;
import java.util.Scanner;

public class ElementCloseToZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
