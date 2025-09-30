package classobj;

public class BookDetails {
	String book="";
	String author="";
	double price;
	BookDetails(String t, String a, double p) {
        book = t;
        author = a;
        price = p;
    }
	void display() {
		System.out.println("Title: "+book+" Author: "+author+" Price: "+price);
	}
	public static void main(String[] args) {
		BookDetails s=new BookDetails("Java Programming", "James Gosling", 450.50);
		
		s.display();
		
		}

}
