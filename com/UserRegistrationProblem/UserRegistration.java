package com.UserRegistrationProblem;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc=new Scanner(System.in);
    public String Name(String priyanka) throws InvalidUserException {
        String fname;
        System.out.println("Enter first name:");
        fname = sc.nextLine();
        try {
            if (Pattern.matches("[A-Z][a-z]{3,}", fname)) {
                System.out.println("Valid First Name");
                return "HAPPY";
            } else {
                System.out.println("Invalid First Name");
                return "SAD";
            }
        } catch (NullPointerException e) {
            throw new InvalidUserException(e);
        }
    }
    public String LastName(String patil) throws InvalidUserException, NullPointerException {
        String lname;
        System.out.println("Enter Last name:");
        lname=sc.nextLine();
        try {
            if (Pattern.matches("[A-Z][a-z]{3,}", lname)) {
                System.out.println("Valid Last Name");
                return "HAPPY";
            } else {
                System.out.println("Invalid Last Name");
                return "SAD";
            }
        }catch (NullPointerException e)
        {
            throw new NullPointerException("Enter valid message");
        }
    }
    public String Email(String s) throws InvalidUserException
    {
        String email;
        System.out.println("Enter Email:");
        email=sc.nextLine();
        try {
            if (Pattern.matches("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", email)) {
                System.out.println("Valid Email");
                return "HAPPY";
            } else {
                System.out.println("Invalid Email");
                return "SAD";
            }
        }catch (NullPointerException e)
        {
            throw new NullPointerException("Enter valid message");
        }
    }
    public String Phone(String s) throws InvalidUserException
    {
        String phone;
        System.out.println("Enter Phone");
        phone=sc.nextLine();
        try {
            if (Pattern.matches("[0-9]{2}[ ]{1}[1-9]{1}[0-9]{9}", phone)) {
                System.out.println("Valid Phone");
                return "HAPPY";
            } else {
                System.out.println("Invalid Phone");
                return "SAD";
            }
        }catch (NullPointerException e)
        {
            throw new NullPointerException("Enter valid message");
        }
    }
    public String Password(String priya1234) throws InvalidUserException
    {
        String pass;
        System.out.println("Enter Phone");
        pass=sc.nextLine();
        try {
            if (Pattern.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,32}$", pass)) {
                System.out.println("Valid Password");
                return "HAPPY";
            } else {
                System.out.println("Invalid Password");
                return "SAD";
            }
        }catch (NullPointerException e)
        {
            throw new NullPointerException("Enter valid message");
        }
    }

}
