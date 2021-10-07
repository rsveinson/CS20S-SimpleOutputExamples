/* *********************************
* Programmer:  sveinson
* Class:       CS20S
*
* Assignment:  Example 5
*
* Description: intro example to assignment and calculation
* ************************************* */
// **** import class libraries ****
import java.util.Scanner;

public class Example5IntroToAssignment
{
    public static void main(String[] args){
    // **** constants ****
    
    // **** variables ****
    
        String banner;
        
        int n1 = 0;         // first operand
        int n2 = 0;         // second operand
        int sum = 0;        // sum of operands
             
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** output banner *****
    
        banner = "**************************\n";
        banner += "Programmer: Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Example 5\n";
        banner += "**************************\n";
        
        System.out.println(banner);
    
    // **** get input ****
        // prompt for input
        
        // read input from keyboard buffer
        
        // echo input back to output window
    
    // **** processing ****
        
        // ** assign values to operands **
        n1 = 9;         // set value of n1 
        n2 = 11;         // set value of n2
        
        // ** do some math **
        sum = n1 / n2;  // add operands
    
    // **** output ****
    
        System.out.println(n1 + " % " + n2 + " = " + sum);
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    } // end of main
}
