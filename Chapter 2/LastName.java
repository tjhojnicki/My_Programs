
//Tommy Hojnicki
//September 2, 2017
//Name thing
//Ask the user for their first, middle, and last name

import java.util.Scanner;

public class LastName
{
    public static void main(String[] args)
    {
        //Defines variables
        String name = new String();
        int index,index1;
        String fname,mname,lname;
        String trash,trash1,trash2;
        //creates a scanner
        Scanner scan=new Scanner(System.in);

        //has the user  input their name
        System.out.print("Please input your name: ");
        name=scan.nextLine();

        //finds the first space then gets the variable for the first name
        index=name.indexOf(' ');
        fname=name.substring(0,index);
        trash=name.substring(0,(index+1));

        //removes the first name and space from the name variable
        name=name.replace(trash,"");

        //finds the index of the second space, which is now the first space, and creates a variable with the middle name and anothe one with the middle name and space
        index1=name.indexOf(' ');
        mname=name.substring(0,(index1));
        trash1=name.substring(0,(index1));

        //removes the middle name and space
        lname=name.replace(trash1,"");

		//System.out.println(trash+" "+trash1+""+lname);
		//System.out.println(fname+"dog"+mname+"dog"+lname);
		//Prints out the first and middle names on the first line and the last name on another line
        System.out.printf("\n"+fname+" "+mname+"\n%-10s\n",lname);

}
}


/*Please input your name: Thomas James Hojnicki

Thomas James
   Hojnicki
Press any key to continue . . .
*/
/*Please input your name: Brad Moore Palagi

Brad Moore
 Palagi
Press any key to continue . . .*/