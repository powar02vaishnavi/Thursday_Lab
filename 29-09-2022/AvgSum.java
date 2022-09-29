/*
	Lab QUE5: WAP to accept no from user in array and find out average and sum of array numbers.
*/

import java.util.*;
public class AvgSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        int n;  //Declare array size
        System.out.println("Enter size of array: ");
        n=sc.nextInt();  // array size
        
        int arr[] = new int[n];    //Declare array
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)      //the array
        {
            arr[i]=sc.nextInt();
        }
        
        // average of array
        int sum = 0;
		double ans;
        for (int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        
        System.out.println("The total sum of all the elements in the array is "+sum);
        ans = (double)sum / n;
        
        System.out.println("The average of all the elements in an array is "+ans);
	}
}
