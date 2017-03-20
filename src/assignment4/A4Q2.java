package assignment4;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author keonj9218
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking them to enter the measurement
        System.out.println("Please enter the measurement in inches you wish to convert:");
        //scanning in their number as a variable
        double inch = input.nextDouble();
        // multiplying their inches into cm
        double cm = 2.54 * inch;
        // telling them what their inches are in cm
        System.out.println(inch + " inches is the same as " + cm + " cm.");
    }
}
