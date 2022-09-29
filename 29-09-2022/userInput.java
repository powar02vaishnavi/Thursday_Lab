/*
Lab QUE4: WAP to accept size from user accordingly accept numbers from user and 
also accept the no from user which you want to delete from your array and display the output.
*/

import java.util.*;
public class userInput 
{
	public static void main(String[] args)	// main method
	{
		int i,del,size;
		char ch;
		Scanner in=new Scanner(System.in);		
		System.out.println("Enter size for array");	// size or array
		size=in.nextInt();
		int n[]=new int[size];
		System.out.println("Enter array elements");	// enter array elements to store in array
	    for(i=0;i<size;i++)
		{
			n[i]=in.nextInt();
		}
		System.out.println("Entered array elements are:");	// print array elements
		for(i=0;i<size;i++)
		{
			System.out.print("\n" +n[i]);
		}
		System.out.println("\nEnter array element to delete : ");	// delete
		del=in.nextInt();
		System.out.println("After deletion of element array is :");
		// logic for deletion of element
		for(i=0;i<size;i++)
		{
			if(n[i]!=del)
			{
				int n1[]=new int[size];
				n1[i]=n[i];
				System.out.print("\t"+n[i]);
			}
		}
	}
}
