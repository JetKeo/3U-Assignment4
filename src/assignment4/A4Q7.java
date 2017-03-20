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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        int square = 1;
        System.out.println("You are now on square 1");
        while (square < 100) {
            System.out.println("Enter sum of dice:");
            int roll = input.nextInt();

            if (roll > 1 && roll < 13) {

                System.out.println("You are now on square:" + (square + roll));
                square = square + roll;
            } else {
                System.out.println("You Quit!");
                break;
            }
            if (square == 54) {
                square = 19;
                System.out.println("You landed on a snake you were moved down to square " + square);
            }
            if (square == 90) {
                square = 48;
                System.out.println("You landed on a snake you were moved down to square " + square);

            }
            if (square == 99) {
                square = 77;
                System.out.println("You landed on a snake you were moved down to square " + square);
            }
            if (square == 34) {
                square = 9;
                System.out.println("You found on a ladder you were moved up to square " + square);
            }
            if (square == 40) {
                square = 64;
                System.out.println("You found on a ladder you were moved up to square " + square);

            }
            if (square == 67) {
                square = 86;
                System.out.println("You found on a ladder you were moved up to square " + square);
            }
            if (square >= 100) {
                System.out.println("Congratulations You Won!");
                break;
            }
        }
    }
}