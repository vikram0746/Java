package arr;

import java.util.Scanner;

public class ReverseTheArray {
	public static void main(String[] args) {
		System.out.println("Enter the elements:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int []a=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
