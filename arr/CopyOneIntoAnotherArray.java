package arr;

import java.util.Scanner;

public class CopyOneIntoAnotherArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements:");
		int s=sc.nextInt();
		int []a=new int[s];
		int []b=new int[s];
		for(int i=0;i<s;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Elements in a array: ");
		for(int i=0;i<s;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<s;i++) {
			b[i]=a[i];
		}
		System.out.println();
		System.out.print("Elements in b array: ");
		for(int i=0;i<s;i++) {
			System.out.print(b[i]+" ");
		}
		}
	}


