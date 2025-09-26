package arr;
import java.util.*;
public class Median {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int arr[]=new int[s];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int b=arr.length/2;
		if(arr.length%2==0) {
			System.out.println("median:"+arr[b-1]+" "+arr[b]);
		}
		else {
		System.out.println("median:"+arr[b]);
		}
		System.out.print(Arrays.toString(arr));
	}
}
//6/2=3
//b=3
//a[b]+a[b-1=a[3]+a[2]
//1,2,3,4,5,6
//5/2=2.5=2
//b=2
//a[b]=a[2]
//1,2,3,4,5