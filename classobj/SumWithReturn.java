package classobj;

public class SumWithReturn {
	int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		SumWithReturn s=new SumWithReturn();
		int summ=s.sum(10,20);
		System.out.println(summ);
	}

}
