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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking the user to type in 4 numbers
        System.out.println("Please enter in 4 numbers on separate lines:");
        //scanning in their 4 numbers as variables
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        double four = input.nextDouble();
        // telling them their four numbers
        System.out.println("Your numbers were " + one + ", " + two + ", " + three + ", and " + four);
    }
}
