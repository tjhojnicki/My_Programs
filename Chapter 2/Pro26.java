//Tommy Hojnicki and Brad Palagi
//September 1, 2017
//Program 2.6
//Reads value of hours minutes and second and puts it in seconds

//Imports needed
import java.util.Scanner;
import java.text.*;

public class Pro26
{
public static void main (String[] args)
{
	int hours,minutes, seconds, totsec;

	//creates a scanner
	Scanner keyboard = new Scanner(System.in);

	//asks the user to input and the hours, minutes, and seconds
	System.out.println("How many hours are there? ");
	hours= keyboard.nextInt();
	System.out.println("How many minutes are there? ");
	minutes= keyboard.nextInt();
	System.out.println("How many seconds are there? ");
	seconds= keyboard.nextInt();

	//calculates the total amount of second
	totsec= (hours*3600)+(minutes*60)+ seconds;

	//prints out the hours,minutes, and seconds in seconds
	System.out.println("The total of "+hours+" hours, "+minutes+" seconds, "+seconds+" seconds is equal to "+totsec+" seconds");




}
}