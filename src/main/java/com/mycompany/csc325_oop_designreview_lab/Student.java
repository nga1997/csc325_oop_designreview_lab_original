/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{

    //Initializing both GPA and credits
    private double gpa;
    private int credits;

    //Class for student
    public Student(String name, short age, int credits, String address){
        super(name, age, address);
        this.gpa = gpa;
        this.credits = credits;
    }

    //Setter and getters for GPA
    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    //Getter and setters for credits
    public int getCredits(){
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    //Getter and Setter for the address
    @Override
    public String getAddress(){
        return this.address;
    }
    @Override
    public void setAddress(String address){
     this.address = address;
    }
    //method to print the results
    @Override
    public String toString(){
        return "Student[ Name= " + getName() + ", Age= " + getAge() + ", Credits= " + getCredits() + " ]";
    }
}
