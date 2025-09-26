package arr;
import java.util.Scanner;
public class TwoDimensionArray {
	public static void main(String[] args) {
		System.out.println("Enter the rows and columns:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++) {
			System.out.println("enter the row"+i);
			for(int j=0;j<b;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
//   1 0 1
//   0 0 1
//   0 1 1