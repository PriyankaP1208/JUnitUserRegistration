import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc=new Scanner(System.in);
    public String Name()
    {
        String fname;
        System.out.println("Enter first name:");
        fname=sc.nextLine();
        if(Pattern.matches("[A-Z][a-z]{3,}",fname))
        {
            System.out.println("Valid First Name");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid First Name");
            return "SAD";
        }
    }
    public String LastName()
    {
        String lname;
        System.out.println("Enter Last name:");
        lname=sc.nextLine();
        if(Pattern.matches("[A-Z][a-z]{3,}",lname))
        {
            System.out.println("Valid Last Name");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid Last Name");
            return "SAD";
        }
    }
    public String Email()
    {
        String email;
        System.out.println("Enter Email:");
        email=sc.nextLine();
        if(Pattern.matches("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",email))
        {
            System.out.println("Valid Email");
            return "HAPPY";
        }
        else
        {
            System.out.println("Invalid Email");
            return "SAD";
        }
    }
}
