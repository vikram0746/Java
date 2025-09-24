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
		System.out.println("median:"+arr[b-1]+" "+arr[b]);
		System.out.print(Arrays.toString(arr));
		
	}
}
