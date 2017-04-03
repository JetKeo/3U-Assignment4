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
        //create a int for what square the player is on
        int square = 1;
        //tell them what square they're on
        System.out.println("You are now on square " + square);
        //while square is less than 100 repeat
        while (square < 100) {
            //tell user to end the sum of the two dices they rolled
            System.out.println("Enter sum of dice:");
            //create a int for the roll
            int roll = input.nextInt();
            //if the roll is greater than 1 but less than 13
            if (roll > 1 && roll < 13) {
                // tell them what square they are on
                System.out.println("You are now on square:" + (square + roll));
                // add the current square + the roll
                square = square + roll;
            } else {
                //if they enter anything out of the dice range say they quit
                System.out.println("You Quit!");
                break;
            }
            //if their square equals a certain number it will either move them up spaces or down spaces
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
            if (square == 9) {
                square = 34;
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
            //if the square equals 100 or greater
            if (square >= 100) {
                //tell them they won
                System.out.println("Congratulations You Won!");
                //break the code
                break;
            }
        }
    }
}