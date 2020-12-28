import com.UserRegistrationProblem.InvalidUserException;
import com.UserRegistrationProblem.UserRegistration;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        try {
            ExpectedException expectedException=ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Name("Priyanka");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result = null;
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnSad() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Name("Pri");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result = null;
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.LastName("Patil");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnSad() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.LastName("Pat");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Email("ppriyapatil1208@gmail.com");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnSad() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Email("ppriya123gmail.com");
        } catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPhone_WhenProper_ShouldReturnHappy() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Phone("91 9887678909");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenPhone_WhenProper_ShouldReturnSad() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Phone("91988767809");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Password("Priya@123");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnSad() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidUserException.class);
            UserRegistration user = new UserRegistration();
            String result = user.Password("priya123");
        }catch (InvalidUserException e)
        {
            e.printStackTrace();
        }
        String result=null;
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }
}
