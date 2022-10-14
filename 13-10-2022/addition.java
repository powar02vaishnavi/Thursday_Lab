import java.util.Scanner;
//WAP to accept the positive numbers  from user and display the sum of that numbers using loop.
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        //taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of positive numbers you want to add :");
		n=sc.nextInt();
        //Defining array
		int posno[] = new int[n];
		System.out.println("Enter "+n+" Numbers :");
        //Inserting elements in array
        for(int i=0;i<n;i++)
        {
            posno[i]=sc.nextInt();
        }
        int total=0;
        //Finding addition of numbers in array
        for(int i=0;i<n;i++)
        {
            total=total+posno[i];
        }
        //Display the total marks
        System.out.println("The Sum of positive number is "+total);
	}

}
