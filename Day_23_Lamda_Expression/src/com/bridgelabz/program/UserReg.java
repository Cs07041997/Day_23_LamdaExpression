package com.bridgelabz.program;

import java.util.Scanner;
import java.util.regex.Pattern;

interface FirstName{
    boolean validateFirstName();
}

interface LastName{
    boolean validateLastName();
}

interface Email {
    boolean validateEmail();
}

interface MobileNumber {
    boolean validateMobileNumber();
}

interface Password {
    boolean validatePassword();
}


public class UserReg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        UserReg userReg = new UserReg();

        FirstName EnterFirstName = () ->  {
            System.out.println("Enter first name :: ");
            String firstName = sc.next();

            return userReg.firstname(firstName);
        };
        EnterFirstName.validateFirstName();
        
        LastName EnterLastName = () -> {
            System.out.println("Enter last name :: ");
            String lastName = sc.next();
            return userReg.lastName(lastName);

        };
        EnterLastName.validateLastName();

        Email EnterEmail = () ->{
            System.out.println("Enter email :: ");
            String email = sc.next();
            return userReg.email(email);
        };
        EnterEmail.validateEmail();


        MobileNumber EnterMobNum = () -> {
            System.out.println("Enter mobile number ::");
            String number = sc.next();
            return userReg.mobile(number);
        };
        EnterMobNum.validateMobileNumber();


        Password EnterPassWord = () ->{
            System.out.println("Please Enter password :: ");
            String password = sc.next();
            return userReg.password(password);
        };
        EnterPassWord.validatePassword();
    }


    boolean firstname(String firstName) {
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", firstName);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw new Exception("please enter valid first Name.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

     boolean lastName(String lastName) {
        boolean answer = Pattern.matches("([A-Z]*[a-z]*){2,}", lastName);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw  new Exception("please enter valid last name.");
            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        return false;
    }
    boolean email(String email) {
        boolean answer = Pattern.matches("[a-z]+([.][a-z]+)*@gmail[.]co([.]in)*", email);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw  new Exception("please enter valid email.");
            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        return false;

    }
    boolean mobile(String number) {
        boolean answer = Pattern.matches("91\\s[0-9]{10}", number);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw new Exception("please enter valid contact number.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;

    }
    boolean password(String password) {
//      rule1 = minimum 8 characters & at least 1 upper case at least one numeric
        boolean answer = Pattern.matches("[A-Z]+[a-z]+\\W[0-9]+", password);
        try {
            if (answer) {
                System.out.println("thank you");
                return true;
            } else {
                throw  new Exception("please enter valid password.");
            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        return false;
	}
}
