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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking the user to type in their name
        System.out.println("Please enter your name:");
        //scanning in their name into a variable
        String name = input.nextLine();
        //ask the user what the tests were out of
        System.out.println("What was the first test out of?:");
        double test1 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double mark1 = input.nextDouble();

        System.out.println("What was the second test out of?:");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double mark2 = input.nextDouble();

        System.out.println("What was the third test out of?:");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double mark3 = input.nextDouble();

        System.out.println("What was the fourth test out of?:");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?:");
        double mark4 = input.nextDouble();

        System.out.println("What was the fifth test out of?:");
        double test5 = input.nextDouble();
        System.out.println("What dmark did you get?:");
        double mark5 = input.nextDouble();
        //get the average of their grade
        double grade1 = mark1 / test1 * 100;
        double grade2 = mark2 / test2 * 100;
        double grade3 = mark3 / test3 * 100;
        double grade4 = mark4 / test4 * 100;
        double grade5 = mark5 / test5 * 100;
        double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
        //tell the user what their grades and average
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + grade1 + "%");
        System.out.println("Test 2: " + grade2 + "%");
        System.out.println("Test 3: " + grade3 + "%");
        System.out.println("Test 4: " + grade4 + "%");
        System.out.println("Test 5: " + grade5 + "%");

        System.out.println("Average: " + average + "%");


    }
}
