/*  Write a program to accept choice from user and perform the operation:
1: factorial
2:sum of digit
3:Armstrong number or not
4:fibonacci series
5:Prime no or Not  */


import java.util.*;
public class Noperation {
public static void main(String[] args) {
    options();
}
public static void options()
{

	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("Choose the operation you want to perform");
	System.out.println("1.Factorial");
	System.out.println("2.Sum Of Digit");
	System.out.println("3.Armstrong number or not");
	System.out.println("4.fibonacci series");
	System.out.println("5.Prime no or not");
	System.out.println("6.Exit");
	n=sc.nextInt();
	switch(n) {
	case 1:
		System.out.println("Factorial of no");
		System.out.print("Enter the number : ");
        int x = s.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
		break;
	case 2:	
	System.out.println("Sum of digit");
		int number, digit, sum = 0;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number: ");  
        number = sc.nextInt();  
        while(number > 0)  
        {  
            //finds the last digit of the given number    
            digit = number % 10;  
            //adds last digit to the variable sum  
            sum = sum + digit;  
            //removes the last digit from the number  
            number = number / 10;  
            } 
            //prints the result  
            System.out.println("Sum of Digits: "+sum);  
		break;
	case 3:	
		System.out.println("Armstrong number or not");
		System.out.print("Enter the number : ");
        int n = s.nextInt();
        int temp = n;
        int p = 0;
        /*function to calculate
          the sum of individual digits
         */
        while (n > 0) {
 
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        /* condition to check whether
           the value of P equals
           to user input or not. */
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println(
                "No. It is not an Armstrong No.");
		break;	
	case 4:	
		System.out.println("fibonacci series");
		 int n, a = 0, b = 0, c = 1;
       // Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
		break;
	case 5:	
		System.out.println("Prime no or not");
		 int num,b,c; 
       // Scanner s=new Scanner(System.in); 
        System.out.println("Enter A Number"); 
        num =s.nextInt(); 
        b=1; 
        c=0; 
        while(b<= num) 
        { 
        if((num%b)==0) 
        c=c+1; 
        b++; 
                } 
        if(c==2) 
        System.out.println(num +" is a prime number"); 
        else 
        System.out.println(num +" is not a prime number");     
        break;      
        case 6:
            System.exit(0);
            
		}
	}
	

}
}
                
