import com.UserRegistrationProblem.InvalidUserException;
import com.UserRegistrationProblem.UserRegistration;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class EmailValidator {
    private String mailId;
    private String result;
    public EmailValidator(String mailId,String result)
    {
        this.mailId=mailId;
        this.result=result;
    }
    public static Collection data()
    {
        return Arrays.asList(new Object[][] {
                {"abc111@abc.com","HAPPY"},
                {"abc123@gmail.1","SAD"},
                {"abc@1.com","HAPPY"},
                {"abc","SAD"},
                {"abc.100@abc.com.com","HAPPY"},
                {"abc@abc@gmail.com","SAD"}
        });
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() throws InvalidUserException {
        UserRegistration user=new UserRegistration();
        String result1=user.Email(this.result);
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }
}
