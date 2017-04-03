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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //ask the user what the speed limit
        System.out.println("Enter the speed limit:");
        //scanning the user input turning it into a variable
        int limit = input.nextInt();
        //ask the recorded speed
        System.out.println("Enter the recorded speed of the car:");
        //create a int variable
        int speed = input.nextInt();
        // if the limit is greater or equal to the speed
        if (limit >= speed) {
            //tell them they are within speed limit
            System.out.println("Congratulations, you are within the speed limit!");
            //if not
        } else {
            //create a variable for the amount they are going over
            int amount = limit - speed;
            //tell them how much their fine would be depending on how fast they were going
            if (amount < 0 && amount > -21) {
                System.out.println("You are speeding and your fine is $100.");
            }
            if (amount < -20 && amount > -31) {
                System.out.println("You are speeding and your fine is $270.");
            }
            if (amount <= -30) {
                System.out.println("You are speeding and your fine is $500.");
            }
        }
    }
}
