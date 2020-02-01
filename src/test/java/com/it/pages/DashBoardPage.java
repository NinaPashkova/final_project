package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashBoardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbUserEmail;
    @FindBy(xpath = "//p[@class='make_message']/a")
    private WebElement btnCreateLetter;
    @FindBy(xpath = "//form[@name='aform']/div[1]")
    private WebElement btnopenLastLetter;
    @FindBy(xpath = "//li[@class='new']")
    private WebElement btninBoxLetter;
    @FindBy(xpath = "//div[@class='from']//a")
    private WebElement lbEmailFrom;
    @FindBy(xpath = "//div[@class='message_header clear']/h3")
    private WebElement lbTheme;
    @FindBy(xpath = "//div[@class='received']//span[1]")
    private WebElement lbDate;
    @FindBy(xpath = "//div[@class='message_body']/pre")
    private WebElement lbText;

    public WebElement getLbEmailFrom() {
        return lbEmailFrom;
    }

    public WebElement getLbTheme() {
        return lbTheme;
    }

    public WebElement getLbDate() {
        return lbDate;
    }

    public WebElement getLbText() {
        return lbText;
    }

    public void createLetter() {
        btnCreateLetter.click();
    }

    public void openInboxLetters() {
        btninBoxLetter.click();
    }

    public void openLastLetter() {
        btnopenLastLetter.click();
    }

    public String getLbUserEmail() {
      driver.getWebDriverWait().until(ExpectedConditions.visibilityOf(lbUserEmail));
        return lbUserEmail.getText();
    }
}
