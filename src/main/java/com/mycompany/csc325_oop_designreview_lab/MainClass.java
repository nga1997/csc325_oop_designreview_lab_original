/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {

	 //Fills the data for available class
	 Freshman std1 = new Freshman("James", (short) 20, 12,"32 Brentwood");

	 Senior std2 = new Senior("John", (short) 30, 90,"45 Crooked Hill");


	 //Scanner to record the GPA of the student
	 try (Scanner scanner = new Scanner(System.in)) {
		 System.out.println("Enter GPA for " + std1.getName() + "= ");
		 double gpa = scanner.nextDouble();
		 std1.setGpa(gpa);

		 System.out.println("Enter GPA for " + std2.getName() + "= ");
		 gpa = scanner.nextDouble();
		 std2.setGpa(gpa);
	 }
	 System.out.println(std1);
	 System.out.println(std2);

	}

}

