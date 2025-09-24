package arr;

import java.util.Scanner;

public class HighestLowest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many values");
		int b=sc.nextInt();
		int a[]=new int[b];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int min = a[0];
        int max = a[0];

		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
//method - Highest - lowest
