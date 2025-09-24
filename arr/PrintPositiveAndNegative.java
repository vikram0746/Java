package arr;

public class PrintPositiveAndNegative {
	public static void main(String[] args) {
		int a[] ={1,2,4,-1,-3};
		int b=0;
		int c=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=0) {
				b+=a[i];
			}else if(a[i]<0) {
				c+=a[i];
			}
		}
		System.out.println(b);
		System.out.println(c);
	}

}
