package arr;
import java.util.*;
public class Median {
	public static void main(String[] args) {
		int []arr= {1,2,5,4,7,9,6};
		Arrays.sort(arr);
		int b=arr.length/2;
		System.out.println("median:"+arr[b]);
		System.out.print(Arrays.toString(arr));
		
	}
}
