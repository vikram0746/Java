package classobj;

public class CountObjects {
	static int counts=0;
	CountObjects(){
		counts++;
	}
	void display() {
		System.out.println(counts);
	}
	public static void main(String[] args) {
		CountObjects s=new 	CountObjects();
		CountObjects a=new 	CountObjects();	
		CountObjects v=new 	CountObjects();
		s.display();
		/*
		 * v.display(); a.display();
		 */
	}

}
