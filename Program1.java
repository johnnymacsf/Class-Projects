package com.Program1;

/**
 *  Program 1 -- 3.29
 *  Given an input of a first name, last name, and four digits.
 *  Creates a login name for the user. 
 *  CS108-1
 *  Date: 1/22/21
 *  @author  John Gill
  */

import java.util.Scanner;

public class Program1 {
	public static String printLoginName(String userFirstName, String userLastName, int userNumbers){
	   char loginFirstName = userFirstName.charAt(0); 
	   String loginLastName = "";
      if(userLastName.length() < 5){
         loginLastName = userLastName;
      }else{
         loginLastName = userLastName.substring(0,5);
      }
      int loginDigits = userNumbers % 100; 
      
	   String str = "Your login name: " + loginFirstName + loginLastName + loginDigits; 
	   
	   return str;
	}
	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      //Variable declarations and initializations as user inputs. 
      String firstName = scnr.next();
      String lastName = scnr.next();
      int userDigits = scnr.nextInt();
      printLoginName(firstName, lastName, userDigits);
      
      scnr.close();
	}
	}
