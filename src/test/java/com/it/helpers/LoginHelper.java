package com.it.helpers;

import com.it.pages.LoginPage;
import com.it.users.User;



public class LoginHelper extends LoginPage {

    public void login(User user)  {
        log.info(String.format("User login username - %s, password - %s", user.userName, user.password));
        loginFillTheInp(user.userName, user.password);
    }
}
