/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */
import java.util.Scanner;
public class Assignment_1_Exercise_19 {
    public static void main(String[] args) {

        // code goes here

        Scanner sc=new Scanner(System.in);

        // user enter height & weight
        System.out.println("Enter the Height in Inches- ");
        double height = sc.nextDouble();
        System.out.println("Enter the weight in pounds- ");
        double weight = sc.nextDouble();


        // bmi = (weight / (height × height)) * 703

        double BMI = (weight / (height * height)) * 703;

        System.out.println("Your BMI is " + String.format("%.2f",BMI));


        if(BMI >= 18.5 && BMI <= 25){
            System.out.println("You are within the ideal weight range");
        }
        else if(BMI >25){
            System.out.println("You are Overweight, You should see your doctor");
        }
        else if(BMI < 18.5){
            System.out.println("You are underweight, You should consult with your doctor");
        }
    }
}
