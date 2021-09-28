/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise29;
import java.util.Scanner;

public class Solution29
{
    public static void main( String[] args )
    {
        String response;
        int rate;
        int years;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("What is the rate of return? ");
            response = scan.nextLine();
            if(!response.matches("[0123456789.]+") || response.equals("0"))
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        while(!response.matches("[0123456789.]+") || response.equals("0"));

        rate = Integer.parseInt(response);
        years = 72/rate;
        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}