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

        System.out.println("Enter the speed limit:");
        int limit = input.nextInt();
        System.out.println("Enter the recorded speed of the car:");
        int speed = input.nextInt();
        if (limit >= speed) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            int amount = limit - speed;
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
