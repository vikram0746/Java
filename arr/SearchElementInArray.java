package arr;

import java.util.Scanner;

public class SearchElementInArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner (System.in);
		System.out.println("Which element:");
		int s=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==s) {
				System.out.println("element"+s+" is present in array");
			}
		}
	}

}
