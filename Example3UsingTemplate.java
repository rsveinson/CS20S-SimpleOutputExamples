/* *********************************
* Programmer:  you name here
* Class:       CS20S
*
* Assignment:  Example 3
*
* Description: using a template to create a new Java class
*               intro to getting input.
* ************************************* */
// **** import class libraries ****
import java.util.Scanner;

public class Example3UsingTemplate
{
    public static void main(String[] args){
    // **** constants ****
    
    // **** variables ****
    
        String banner;      // otuput banner text
        
        int age = 0;        // persons age
     
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
    
    // **** output banner *****
    
        banner = "**************************\n";
        banner += "Programmer: Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Example 3\n";
        banner += "**************************\n";
        
        System.out.println(banner);
    
    // **** get input ****
        // prompt for input
        System.out.println("enter your age.");
        
        // read input from keyboard buffer
        age = scanner.nextInt();
        
        // echo input back to output window
        System.out.println("you entered " + age);
    
    // **** processing ****
    
    // **** output ****
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    } // end of main
}
