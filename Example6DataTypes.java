/* *********************************
* Programmer:  you name here
* Class:       CS20S
*
* Assignment:  Example 6
*
* Description: Using scanner to get input fromt the keyboard
*               using data types to do some work
* ************************************* */
// **** import class libraries ****
import java.util.Scanner;

public class Example6DataTypes
{
    public static void main(String[] args){
    // **** constants ****
    
    // **** variables ****
    
        String banner;
        
        int age = 0;            // person's age
        double shoeSize = 0.0;  // person's shoe size
        
        // variables for math
        int n1 = 0;         // fist int for math
        int n2 = 0;         // second int for math
        int result = 0;     // result of integer arithmetic
     
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** output banner *****
    
        banner = "**************************\n";
        banner += "Programmer: Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Example 6\n";
        banner += "**************************\n";
        
        System.out.println(banner);
    
    // **** get input ****
        // prompt for input
        // System.out.println("enter your age and your shoe size separated by a space");
        System.out.println("enter two integers.");
        
        // read input from keyboard buffer
        // age = scanner.nextInt();        // get an int from the buffer
        // shoeSize = scanner.nextDouble();    // get shoe size from buffer
        n1 = scanner.nextInt();         // read first operand
        n2 = scanner.nextInt();         // read second int
        
        // echo input back to output window
        // System.out.println("you entered." + age);
        // System.out.println("you also entered." + shoeSize);
        
        System.out.println("you entered " + n1 + " and " + n2);
    
    // **** processing ****
    
        result = n1 + n2;           // add n1 and n2
    
    // **** output ****
        
        System.out.println(result);
        
    // **** closing message ****
    
        System.out.println("end of program.");
    
    } // end of main
}
