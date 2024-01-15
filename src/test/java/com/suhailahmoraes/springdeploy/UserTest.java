package com.suhailahmoraes.springdeploy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {


    User user = new User("Amanda", "amanda@email.com");
    @Test
    public void isTrueUserDataWhenTheDataIsTrue() {

        User userExpected = new User("Amanda", "amanda@email.com");

        Assertions.assertEquals(userExpected, user);
    }

    @Test
    public void isFalseWhenTheDataDifferent() {

        User userExpected = new User("Mariano", "mari@email.com");

        Assertions.assertFalse(userExpected.equals(user));
    }

    @Test
    public void isFalseWhenTheDataIsEmpty() {

        User emptyUser = new User();

        Assertions.assertFalse(emptyUser.equals(user));
    }

    @Test
    public void isFalseWhenLoginIsEmpty() {
        User userExpected = new User("","amanda@email.com");

        Assertions.assertFalse(userExpected.equals(user));
    }


    @Test
    public void isFalseWhenEmailIsEmpty() {
        User userExpected = new User("Amanda","");

        Assertions.assertFalse(userExpected.equals(user));
    }
}
