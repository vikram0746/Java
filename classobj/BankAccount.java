package classobj;

import java.util.Scanner;

public class BankAccount {
	int accNumber=0;
	double amount=0;
	BankAccount(int Accno,double Balance){
		accNumber=Accno;
		amount=Balance;
	}
	void deposit(int d) {
		if(d>=0) {
			amount+=d;
			System.out.println("Deposit amount: "+d);
		}
		else {
			System.out.println("Invalid amount");
		}
		
	}
	void withdraw(int w) {
		if(amount>=w) {
			amount-=w;
			System.out.println("Withdrawl amount: "+w);
		}
		else {
			System.out.println("Invalid amount");
		}
		
	}
	void display() {
		System.out.println("Account number: "+accNumber);
		System.out.println("Balance Amount: "+amount);
		
	}
	
	public static void main(String[] args) {
		BankAccount s=new BankAccount(12345,1000) ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deposit Amount: ");
		int d=sc.nextInt();
		System.out.println("Enter Withdraw Amount: ");
		int w=sc.nextInt();
		s.deposit(d);
		s.withdraw(w);
		s.display();
		}
	
}
