
/**
 *Tommy Hojnicki
 *September 2, 2017
 *Random phone number
 *Generates a random phone number that fits the certain restrictions that are in place for that set of numbers

*/
import java.util.Random;
import java.text.DecimalFormat;

public class phone
{
    public static void main(String[] args){

        Random gen = new Random();

        //defines variables
        int first, second, third;
        int area,numf,nums;
        String area1, num11,num2;

        //creates random integers
        first=gen.nextInt(8);
        second=gen.nextInt(8);
        third=gen.nextInt(8);

        //makes new strings and then changes the numbers to strings do they can be added
        String one= new String();
        one=Integer.toString(first);
        String two= new String();
        two=Integer.toString(second);
        String three= new String();
        three=Integer.toString(third);

        //creates the area code
        area1=one+two+three;
        //changes it back to an Integer
        area=Integer.parseInt(area1);
        //gets the middle three number
        numf= gen.nextInt(743);
        //gets the last four digits of the phone number
        nums=gen.nextInt(10000);

        //Creates Decimal formats for the different lengths of numbers
        DecimalFormat threeD =new DecimalFormat("000");
        DecimalFormat fourD =new DecimalFormat("0000");

        //displays the number
        System.out.printf("\nPhone Number:\t"+ threeD.format(area)+"-"+threeD.format(numf)+"-"+fourD.format(nums)+"\n");
    }
}

/*Phone Number:   603-276-6888
Press any key to continue . . .*/

/*Phone Number:   555-302-3306
Press any key to continue . . .*/