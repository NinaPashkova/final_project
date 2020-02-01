package com.it.tests;

import com.it.App;
import com.it.letters.Letter;
import com.it.letters.LetterFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {

    static protected App app = new App();
    static protected User validUser = UserFactory.getValidUser();
    static protected Letter newLetter = LetterFactory.sendLetter();

    @BeforeSuite
    public void setup() {

    }

    /*@BeforeSuite
    public void login() throws InterruptedException {
       app.login.login(validUser);
    }*/

    @AfterSuite
    public void tearDownSuite() {
        app.common.stopApp();
    }
}
