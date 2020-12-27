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
}
