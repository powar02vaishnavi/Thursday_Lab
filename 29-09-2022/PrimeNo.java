/*
Lab QUE3: WAP to accept a no from user and check it is prime or not. 
Pass this number in different function and check it is even or odd. 
IF number is even than check it is divisible by 10 or not in different 
function and is no is odd than check it is divisible by 3 or not in different function

*/

import java.util.*;
public class PrimeNo 
{
	int n,temp=0,i,count;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{	
		
		PrimeNo obj = new PrimeNo();
		obj.prime();
	}
	
	void prime() {
		System.out.println("Enter The Number ");
		n = sc.nextInt(); 
		for(i=2;i<n;i++)	//prime number is not divided by itself and 1 so start from 2
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)                       //check count is equal to 0 
	           System.out.println(+n+" is a Prime Number.");                                                               
	        else
	           System.out.println(+n+" is not a Prime Number.");
		evenOdd(n);
	 } 
	 void evenOdd(int n)
	 { // executes when number is prime
		 if(n%2==0) { 
			 System.out.println("it is even number");
			 if(n%10==0) { 
				 System.out.println("it is Divisble by 10");
			 }
			 else{
				 System.out.println("it is not divisble by 10"); 
			 }
		 } 
		 else { 
			 System.out.println("it is Odd number");
			 if(n%3==0) { 
				 System.out.println("it is divisible by 3");
			 }
			 else {
				 System.out.println("it is not divisible by 3");
			 }
		 }
	 }
}
