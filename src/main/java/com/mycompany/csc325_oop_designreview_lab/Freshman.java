package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{

    //public Freshman, borrowing the name, age, credits, and address from Human
        public Freshman(String name, short age, int credits, String address) {
            super(name, age, credits, address);
        }
    //method to print the results
        public String toString(){
            return "Senior[ Name= " + getName() + ", Age= " + getAge() + ", Credits= " + getCredits() + ", Address= " + getAddress() + "]";
        }
}
