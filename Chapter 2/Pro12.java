//Tommy Hojnicki
//August 30, 2017
//Program 2.12
//asks the user to input how many of the different coins the user has

import java.util.Scanner;
import java.text.NumberFormat;



public class Pro12
{

public static void main(String []args)
{
	Scanner keyboard= new Scanner(System.in);

	double quarter,dime,nickel,penny,value;

	System.out.print("How many quarters do you have: ");
	quarter=keyboard.nextInt();

	System.out.print("\nHow many dimes do you have: ");
	dime=keyboard.nextInt();

	System.out.print("\nHow many nickels do you have: ");
	nickel=keyboard.nextInt();

	System.out.print("\nHow many pennies do you have: ");
	penny=keyboard.nextInt();

	value=(quarter*.25)+(dime*.10)+(nickel*0.05)+(penny*0.01);

	NumberFormat money = NumberFormat.getCurrencyInstance();

	System.out.print("\nThe total value of your coins is "+money.format(value)+".\n");














}
}