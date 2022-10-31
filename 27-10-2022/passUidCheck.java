import java.util.Scanner;

//Write a program to accept basic details name , Phone No , Address , user Id and password from the user. throw an exception if the user Id lenght is greater than 8 and password is not matched and should only contain the string value. Password rules: A password must have at least eight characters. A password consists of only letters and digits. A password must contain at least two digits.

public class passUidCheck {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String name,ph_no,address,user_id,password;
		String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		boolean check = false;
		//taking user input
		System.out.println("Enter Name : ");
		name=sc.next();
		System.out.println("Enter Phone Number : ");
		ph_no=sc.next();
		System.out.println("Enter Address : ");
		address=sc.next();
		System.out.println("Enter User ID : ");
		user_id=sc.next();
		System.out.println("Enter Password : ");
		password=sc.next();
		//try catch for User ID
		try {
			if(user_id.length()>8) {
				throw new Exception ("User Id must not be greater than 8");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//try catch for Password
		try {
			if(password.length()>8) {
				throw new Exception ("Password must not be greater than 8");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//try catch for password special characters
		for (int i = 0; i < password.length(); i++) {
			String strChar = Character.toString(password.charAt(i));
			// Check whether String contains special character or not
			if (specialChars.contains(strChar)) {
				check = true;
				break;
			}
		}
		//try catch to throw exception based on pass character boolean
		try {
			if (check) {
				throw new Exception("Password Must not Contain Special Character");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//final output
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+ph_no);
		System.out.println("Address : "+address);
		System.out.println("User ID : "+user_id);
		System.out.println("Password : "+password);
	}

}
