package arr;

import java.util.Scanner;

public class MeanIsingArray {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int b= in.nextInt();
		int a[]=new int[b];
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
		}
		double s=sum/a.length;
		System.out.println(s);
	}

}
