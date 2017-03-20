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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to get user input
        Scanner input = new Scanner(System.in);
        //asking the user to type in their name
        System.out.println("Please enter your name:");
        //scanning in their name into a variable
        String name2 = input.nextLine();
        //saying hello to the user
        System.out.println("Hello " + name2 + ". How was your day?");
    }
}
