//WAP to craete  ATM  where customer enter our details ,pin and withdrawal cash or deposit cash.. In this program you have to use encapculation for hinding user details and inheritance,polymorphism and interface.
import java.util.Scanner;

public class userprocess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userprocess obj = new userprocess();
		obj.process();
	}
	public void process() {
		//taking user input
		Scanner sc = new Scanner(System.in);
		//initializing variables
		String u_id,bankname;
		char ans;
		int u_pass,u_bal,ch,balance = 0;
		bankprocess obj = new bankprocess();
		System.out.println("Enter Bank name ");
		bankname=sc.next();
		System.out.println("Enter User name ");
		u_id=sc.next();
		System.out.println("Enter Account Pass");
		u_pass=sc.nextInt();
		obj.getPass();
		//if block to check password
	if(obj.getPass()==u_pass) {
		do{
		System.out.println("Do you want to\n1. Credit\n2. Debit");
		ch=sc.nextInt();
		//switch case to initialize credit or debit method
		switch (ch) {
		case 1:
			System.out.println("Enter Amount you want to Credit");
			balance=sc.nextInt();
			obj.setAc_balcr(balance);
			System.out.println("The Username is "+u_id);
			System.out.println("The Bankname is "+bankname);
			System.out.println("The Account balance is Rs."+obj.getAc_balcr());
			break;
		case 2:
			System.out.println("Enter Amount you want to Debit");
			balance=sc.nextInt();
			obj.setAc_baldb(balance);
			if (obj.getAc_baldb()>=0) {
				System.out.println("The Username is "+u_id);
				System.out.println("The Bankname is "+bankname);
				System.out.println("The Account balance is Rs."+obj.getAc_baldb());
			} else {
				System.out.println("The Bank Account does not have Sufficient Funds to Withdraw");
			}
			
			break;

		default:
			System.out.println("Enter Valid Input");
			break;
		}
		System.out.println("Do you want to continue transaction? y/n");
		ans=sc.next().charAt(0);
	}
	while(ans=='Y'||ans=='y');
	}
		else {
		System.out.println("You've Entered wrong Password try again");
	}
}
		
	}
