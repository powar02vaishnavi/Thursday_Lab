import java.util.Scanner;

//Program to input age from user and throw user-defined exception if entered age is negative In this program, we have created an exception class AgeException which extends the built-in Exception class. In main method, we read the input from user using Scanner after that we check the age in try block. If it is less than 18 then it will throw an exception other it will display message "Valid age".
//Custom Exception for Age
class AgeException extends Exception
{
    public AgeException(String s)
    {
        super(s);
    }
}

public class ageVerification {
	static int age;
    public static void main(String args[])
    {
        //try catch for checking positive or negative method on age
        try
        {
            getAge();
        }
        catch(AgeException e)
        {
            System.out.println(e);
        }
        //try catch to check if the age is more than 18 or not if less than 18 then throw exception
        try {
        	if (age<18) {
        		throw new Exception("Age should be more than 18");
        	}
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
        //printing final message if program runs without any exceptions
        System.out.println(+age+" is Valid age");
    }

    public static void getAge() throws AgeException
    {
        Scanner sc = new Scanner(System.in);
        //taking input from user for age
        System.out.println("Enter age");
        age = sc.nextInt();
        //checking if age is positive or negative
        if(age<0) {
            throw new AgeException("Age can't be negative");
        }
        else {
            System.out.println("Age is "+age);
        }
    }

}
