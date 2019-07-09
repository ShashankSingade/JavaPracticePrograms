package Cafe;

import java.util.*;

public class UserDefinedMethods
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
            double total = getTotal();
            print(total);
    }

public static double getTotal()
{
    double total=0;
    Boolean moreItems=true;
    char response;
    while(moreItems)
    {
        total=total+getItemPrice(getItemName());
        System.out.println("More items? Y/N");
        response = in.next().charAt(0);
        if(response !='Y' && response !='y')
                    moreItems = false;
        in.nextLine();
    }
    return total;    
}    
    
public static String getItemName()
{
    String name;
    System.out.println("Enter the item Name: ");
    name = in.nextLine();
    return name;
}

public static double getItemPrice(String value)
{
    double price=0;
    try{
        System.out.println("Enter the price for " +value+ ":");
        price=in.nextDouble();
        }
    catch(Exception e)
        {
        System.out.println("Invalid data type entered");
        e.printStackTrace();
        }
    int quantity = getItemQuantity();
   return quantity*price;    
   
}

public static int getItemQuantity()
{ 
    int quantity;
    System.out.println("Enter the quantity for this item: ");
    quantity = in.nextInt();
    return quantity;
}
    
public static void print(double total)
{
//	String result = String.format("%.2f", total);
    System.out.printf("The total price for the items on the grocery list is: %.2f ", +total);
}
    
}