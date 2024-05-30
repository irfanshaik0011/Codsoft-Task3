import java.util.*;
public class customer {
	public static void main(String[] args) {
		System.out.println("Hello sir/ma'am");
		atm a = new atm();
		a.display();
	}
}

class atm {
	int amt,s_amt=0;
	void display() {
		int a = 1, i, choice;
		while (a <= 10) {
			System.out.println("");
			System.out.println("choose an option\n");
			System.out.println("1:Deposit cash \t2:Display balance\t3:Withdraw Cash\n");
			Scanner sin = new Scanner(System.in);
			choice = sin.nextInt();
			switch (choice) {
			case 1 :
				deposit(); 
				break;
			case 2 :
				balance();
				break;
			case 3 :
				withdraw();
				break;
			default :
				System.out.println("select correct option");
				break;
			}
		}
	}
	void balance() {
		if (amt >= 500)
			System.out.println("Balance is " + s_amt);
		else {
			System.out.println("Your balance is "+s_amt);
				System.out.println(" \n");
		}
	}
	void deposit() {
		System.out.println("Enter the deposit amount\n");
		Scanner s = new Scanner(System.in);
		amt = s.nextInt();
		s_amt=s_amt+amt;
		System.out.println("amount deposited !!!\n");
			System.out.println("amount is \n"+s_amt);
			System.out.println(" \n");
	}

	void withdraw() {
		int i;
		System.out.println("Enter the  withdraw amount\n\n");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		if(i<=s_amt)
	{	s_amt = s_amt - i;
		System.out.println("Amount withdraw completed");
		System.out.println(" \n");
		}
	else{
		System.out.println("Insufficient amount");
		System.out.println(" \n");
		}
	}
}