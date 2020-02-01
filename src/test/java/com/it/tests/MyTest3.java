package com.it.tests;

import com.it.letters.LetterFactory;
import com.it.users.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ResourceBundle;


public class MyTest3 extends BaseTest {
    @Test(priority = 0)
    public void testLogin() throws InterruptedException {
        app.login.login(validUser);
        User checkUser = new User(app.login.checkUserName(),app.login.checkEmail(),
                ResourceBundle.getBundle("user").getString("email"));
        Assert.assertEquals(checkUser,validUser);
        app.login.loginBtnClick();
        Assert.assertEquals(app.dashBoard.getLbUserEmail(), validUser.email, "User didn't login successfully");
    }

    @Test(priority = 1)
    public void testLetterSend() {
        app.dashBoard.createLetter();
        app.createLetter.newLetter(newLetter);
        newLetter.date = LetterFactory.getDate();
        Assert.assertEquals(app.dashBoard.getLetter(), newLetter );

    }
}
