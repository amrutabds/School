package basic.str;

/*Check if string contains valid number example.
This example shows how to check if string contains valid number
or not using parseDouble and parseInteger methods of
Double and Integer wrapper classes.
*/

public class CheckValidNumberExample {

public static void main(String[] args) {
       
        String[] str = new String[]{"10.20", "soona","123456", "12.invalid"};
        System.out.println("str[i].indexOf("+str[2].indexOf("."));
       
        for(int i=0 ; i < str.length ; i ++)
        {
               
                if( str[i].indexOf(".") > 0 )
                {
               
                        try
                        {
                                /*
                                 * To check if the number is valid decimal number, use
                                 * double parseDouble(String str) method of
                                 * Double wrapper class.
                                 *
                                 * This method throws NumberFormatException if the
                                 * argument string is not a valid decimal number.
                                 */
                                Double.parseDouble(str[i]);
                                System.out.println(str[i] + " is a valid decimal number");
                        }
                        catch(NumberFormatException nme)
                        {
                                System.out.println(str[i] + " is not a valid decimal number");
                        }
                       
                }
                else
                {
                        try
                        {
                                /*
                                 * To check if the number is valid integer number, use
                                 * int parseInt(String str) method of
                                 * Integer wrapper class.
                                 *
                                 * This method throws NumberFormatException if the
                                 * argument string is not a valid integer number.
                                 */

                                Integer.parseInt(str[i]);
                                System.out.println(str[i] + " is valid integer number");
                        }
                        catch(NumberFormatException nme)
                        {
                                System.out.println(str[i] + " is not a valid integer number");
                        }
                }
        }
       
}
}

/*
Output would be
10.20 is a valid decimal number
123456 is valid integer number
12.invalid is not a valid decimal number
*/
