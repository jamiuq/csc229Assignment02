package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
    private String Address; // address of student, overloaded because otherwise inaccessible
    private double GPA; // gpa of student

    public Student(String name, short age, String Address, double GPA)
    {
        super(name, age); // initialize variables
        this.Address = Address;
        this.GPA = GPA;
    }

    @Override
    public String getAddress() {return Address;} // returns address
    @Override
    public void setAddress(String Address) {this.Address = Address;} // sets address

    public double getGPA() {return GPA;} // returns gpa
    public void setGPA(double GPA) {this.GPA = GPA;} // sets gpa

    @Override
    public String toString() {return "Name: " + super.getName() + ", Age: " + super.getAge() + " Address: " + Address + ", GPA: " + GPA;}
}
