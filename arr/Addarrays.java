package arr;

import java.util.Scanner;

public class Addarrays {
	public static void main(String[] args) {
		/* int[] a = {1, 2, 3, 4, 5};
	        int[] b= {5, 4, 3, 2, 1};

	      

	        // Create a one-dimensional array to store the sum
	        int[] c = new int[a.length];

	        // Add corresponding elements
	        for (int i = 0; i < a.length; i++) {
	            c[i] = a[i] + b[i];
	        }
	        for (int i=0;i<a.length;i++) {
	            System.out.print(c[i] + " ");c = a+b;
	        }
	    }
	}
int a[]= {1,2,3,4};
int b[]= {4,3,2,1};
int c[]=new int [a.length];*/
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[]=new int[a];
		int arr2[]=new int[b];
		if(a!=b) {
			System.out.print("Enter equal values");
		}
		int result[]=new int[a];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("");
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("");
			arr2[i]=sc.nextInt();
		}
		
for (int i = 0; i < result.length; i++) {
	result[i]=arr[i]+arr2[i];
}
for(int i=0;i<arr.length;i++) {
	System.out.print(result[i]+" ");
}
	}
}
