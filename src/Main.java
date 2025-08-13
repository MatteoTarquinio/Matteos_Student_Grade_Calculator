//Matteo Tarquinio 2025-08-13

// this simple program will calculate the average grade of a certain amount of students,
// then tells us if they passed or failed !

import java.util.Scanner; // this allows us to get the input from our users!

public class Main {

    public static void main(String[] args) {

        // The scanner is used to read what the user types into our prompt
        Scanner input = new Scanner(System.in);

        System.out.println("----Matteo's Student Grade Calculator----"); // TITLE

        // This will ask users how many students grades will be calculated
        System.out.print("How many grades do you have to enter?");
        int numberOfGrades = input.nextInt(); // Reads the int from the input

        // Now we make a simple array list to store the grades
        double[] grades = new double[numberOfGrades];

     //Simple loop to ask the user to type each grade, it outputs "Enter grade" until the amount-
        // of grades are reached

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextDouble(); // This saves the grade into the array
        }

        //This will now add all the grades from the array all together
        double total = 0; // We start from 0
        for (int i = 0; i < numberOfGrades; i++) {
            total += grades[i]; // this adds each grade to the total
        }

        // This is simple math to divide the number of grades by the total amount
        double average = total / numberOfGrades;

        // Now we show the results to the user, which is the average of all the grades counted
        System.out.println("\n Results ");
        System.out.println("Average grade: " + average);

        // Now this code checks if the average grade of the class is over 50
        //we check if its over 50 first which equals a pass
        //then if it is less we print out a fail!
        if (average >= 50) {
            System.out.println("Status: PASS! ");
        } else {
            System.out.println("Status: FAIL! ");
        }

       //this just closes the scanner so no resources leak. 
        input.close();
    }
}

