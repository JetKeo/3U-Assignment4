/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author keonj9218
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking them questions about cost
        System.out.println("How much does the food for prom cost? :");
        //scanning their number as a variable
        int prom = input.nextInt();
        System.out.println("How much does the DJ cost? :");
        int dj = input.nextInt();
        System.out.println("How mcuh does it cost to rent the hall? :");
        int hall = input.nextInt();
        System.out.println("How much does decorations cost? :");
        int decoration = input.nextInt();
        System.out.println("How much does it cost for staff? :");
        int staff = input.nextInt();
        System.out.println("How much for miscellaneous costs? :");
        int miscellaneous = input.nextInt();
        // add all the variables together into a total
        int total = prom + dj + hall + decoration + staff + miscellaneous;
        //divide the total by 35 to get the amount of tickets needed
        int ticket = total / 35;
        // tell the user the total and amount of tickets needed.
        System.out.println("The total cost is $" + total + ". You will need to sell " + ticket + " tickets to break even.");
    }
}
