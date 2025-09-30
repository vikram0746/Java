package arr;

import java.util.Scanner;

public class MergingArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of first array: ");
		int s=sc.nextInt();
		System.out.println("Enter the elements of Elements array: ");
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the length of Second array: ");
		int v=sc.nextInt();
		System.out.println("Enter the length of Second array: ");
		int b[]=new int[v];
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		int c=s+v;
		int x[]=new int[c];
		for(int i=0;i<a.length;i++) {
			x[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			x[s+i]=b[i];
		}
		for(int i=0;i<x.length;i++) {
		System.out.println(x[i]);
		}
	}

}
