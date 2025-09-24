package arr;

import java.util.Scanner;

public class OddEvenSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many values");
		int s = sc.nextInt();
		int a[]=new int[s];
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even+=a[i];
			}
			else if(a[i]%2!=0) {
				odd+=a[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
	}

}
