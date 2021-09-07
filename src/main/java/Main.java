/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        double init;
        double tax=0;
        double tax_total;
        String state, county;
        Scanner input= new Scanner(System.in);
        System.out.print("What is the order amount? ");
        init=input.nextDouble();
        //skip a line in the input for later scanning
        input.nextLine();
        System.out.print("What State do you live in? ");
        //a for loop to run until the next line has a user input, else the program halts
        while(true) {
            if(input.hasNext()) {
                state = input.nextLine();
                break;
            }
        }
        System.out.print("What County do you live in? ");
        while(true) {
            if(input.hasNext()) {
                county = input.nextLine();
                break;
            }
        }
        if(state.equals("Wisconsin")){
            tax+=0.05;
            if(county.equals("Eau Claire"))
                tax+=0.005;
            else if(county.equals("Dunn"))
                tax+=0.004;
        }else if(state.equals("Illnois"))
            tax+=0.08;
        tax_total=Math.round(tax*init*100.0)/100.0;
        System.out.format("The tax is %.2f\nThe total is %.2f",tax_total,init+tax_total);
    }
}
