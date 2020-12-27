package com.UserRegistrationProblem;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy()
    {
        UserRegistration user=new UserRegistration();
        String result=user.Name("Priyanka");
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String result=user.Name("Pri");
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String result=user.LastName("Patil");
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String result=user.LastName("Pat");
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String result=user.Email("ppriyapatil1208@gmail.com");
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String result=user.Email("ppriya123gmail.com");
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPhone_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String result=user.Phone("91 9887678909");
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenPhone_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String result=user.Phone("91988767809");
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String result=user.Password("Priya@123");
        Assert.assertThat(result, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String result=user.Password("priya123");
        Assert.assertThat(result, CoreMatchers.is("SAD"));
    }
}
