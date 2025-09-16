package com.mycompany.csc229_211review_lab02hw;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {

    public static void main(String[] args) {
        Student std1 = new Student("James", (short) 20, "123 Sesame St", 4.2); // creates student object

        Scanner input = new Scanner(System.in); // creates scanner object
        System.out.print("Enter the student's GPA: "); // tells user what to do
        std1.setGPA(input.nextDouble()); // sets gpa of student to user input


        System.out.println(std1); // prints output
    }

}