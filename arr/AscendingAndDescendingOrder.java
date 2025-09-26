package arr;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescendingOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enteer how many elements to be stored:");
		int s= sc.nextInt();
		Integer []a=new Integer[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Ascending Order:");
		for(int i=0;i<a.length;i++) {
			System.out.print("{"+a[i]+"}");
		}
		System.out.println();
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Descending Order:");
		for(int i=0;i<a.length;i++) {
			System.out.print("{"+a[i]+"}");
		}
	}
	

}
