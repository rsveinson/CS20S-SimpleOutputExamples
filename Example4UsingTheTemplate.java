/* *********************************
 * Programmer:  Sveinson
 * Class:       CS20S
 *
 * Assignment:  Example 4
 *
 * Description: simple example show how to use FormatTemplate.java
 *               to create a new class
 * ************************************* */
// **** import class libraries ****
import java.util.Scanner;

public class Example4UsingTheTemplate
{
    public static void main(String[] args){
        // **** constants ****

        // **** variables ****

        String banner;

        // **** objects ****

        Scanner scanner = new Scanner(System.in);

        // **** output banner *****

        banner = "**************************\n";
        banner += "Programmer: Sveinson\n";
        banner += "Class: CS20S\n";
        banner += "Assignment: Example 4\n";
        banner += "**************************\n";

        System.out.println(banner);

        // **** get input ****

        // **** processing ****

        // **** output ****

        System.out.println("pay attention to code formatting.");
        System.out.print("It's really important, ");
        System.out.println("Proper indenting and spacing along with");
        System.out.println("comments, section headings and a banner");
        System.out.println("closing message are important parts of any");
        System.out.println("Java program.");
        
        System.out.println();
        System.out.println("use whitespace to make calculations easier to read");
        System.out.println("for example " + (12 * 4));

        // **** closing message ****

        System.out.println("end of program.");

    } // end of main
}
