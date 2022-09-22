//wap to create a menu for food counter and accept the items from user and display the final bill amount with the item is ordered

//WAP to Create a menu for food counter and accept the items from user and display the final Bill amount with the item is ordered

import java.util.*;

public class hotelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu_item,menu1,i_price=0;
		  char ans;
		  //adding order list to string i_name
		  String i_name="";
		  Scanner sc=new Scanner(System.in);
		  //using do while loop
		  do
		  {
		   System.out.println("Menu:\n1:Starters \n2:Main course \n3:Desserts");
		   menu_item=sc.nextInt();
		   //using switch case to get main choice
		   switch(menu_item)
		   {
		   case 1:
			System.out.println("1:Masala Papad \t\t 120Rs");
			System.out.println("2:Paneer Tikka \t\t 359Rs");
			System.out.println("3:Aloo Ke Pakode \t 229Rs");
		    menu1=sc.nextInt();
		    //using switch case to get sub choice
		    switch(menu1)
		    {
		    case 1:
		     i_price+=120;
		     i_name+="\nMasala Papad";
		     break;
		    case 2:
		     i_price+=359;
		     i_name+="\nPaneer Tikka";
		     break;
		    case 3:
		     i_price+=229;
		     i_name+="\nAloo Ke Pakode";
		     break;
		    default:
		     System.out.println("Invalid choice");
		      
		    }
		    break;
		   case 2:
			System.out.println("1:Paneer Makhni \t\t 349Rs");
			System.out.println("2:Rajma Masala \t\t\t 319Rs");
			System.out.println("3:Punjabi Tawa Veg \t\t 339Rs");
		    menu1=sc.nextInt();
		    //using switch case to get sub choice
		    switch(menu1)
		    {
		    case 1:
		     i_price+=349;
		     i_name+="\nPaneer Makhni";
		     break;
		    case 2:
		     i_price+=319;
		     i_name+="\nRajma Masala";
		     break;
		    case 3:
		     i_price+=339;
		     i_name+="\nPunjabi Tawa Veg";
		     break;
		    default:
		     System.out.println("Invalid choice");
		      
		    }
		    break;
		   case 3:
			System.out.println("1:Ice Cream \t\t 100Rs");
			System.out.println("2:Custard \t\t 200Rs");
			System.out.println("3:Cheese Cake \t\t 200Rs");
		    menu1=sc.nextInt();
		    //using switch case to get sub choice
		    switch(menu1)
		    {
		    case 1:
		     i_price+=100;
		     i_name+="\nIce Cream";
		     break;
		    case 2:
		     i_price+=200;
		     i_name+="\nCustard";
		     break;
		    case 3:
		     i_price+=200;
		     i_name+="\nCheese Cake";
		     break;
		    default:
		     System.out.println("Invalid choice");
		      
		    }
		    break;
		   
		   }
		   System.out.println("Do you want to order another dish y/n");
		   ans=sc.next().charAt(0);
		  }
		  while(ans=='Y'||ans=='y');
		  System.out.println("Thanks for coming");
		  System.out.println("The Food Items ARE:\n"+i_name);
		  System.out.println("The Total bill amount is:"+i_price);
	}

}
