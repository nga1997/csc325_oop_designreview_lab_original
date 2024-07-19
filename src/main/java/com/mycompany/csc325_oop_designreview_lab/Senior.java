package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {

    //public Senior, borrowing the name, age, credits, and address from Human
    //The if statement to check if credits are under or over desired amount.
    public Senior(String name, short age, int credits, String address){
        super(name, age, credits, address);
        if (credits < 85){
            throw new IllegalArgumentException("credits must be greater than 85");
        }
    }
    //method to print the results
    public String toString(){
        return "Senior[ Name= " + getName() + ", Age= " + getAge() + ", Credits= " + getCredits() + ", Address= " + getAddress() + "]";
    }
}
