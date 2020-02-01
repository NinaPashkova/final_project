package com.it.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(name = "login")
    private WebElement inputLogin;
    @FindBy(name = "pass")
    private WebElement inputPassword;
    @FindBy(xpath = "//input[@tabindex='5']")
    private WebElement btnLogin;

    protected void loginFillTheInp(String userName, String password)  {
       // driver.scrollDown();
        //try {
         //   Thread.sleep(2000);
       // } catch (InterruptedException e) {
        //    e.printStackTrace();
       // }
       // driver.scrollUp();
        inputLogin.sendKeys(userName);
        inputPassword.sendKeys(password);

    }
    public String checkUserName(){
        return inputLogin.getAttribute("value");
    }
    public String checkEmail(){
        return inputPassword.getAttribute("value");
    }
    public void loginBtnClick(){
        btnLogin.click();
    }

}
