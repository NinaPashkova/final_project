package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLetterPage extends BasePage {
    @FindBy(xpath = "//textarea[@id='to']")
    private WebElement emailAddressInput;
    @FindBy(xpath = "//input[@tabindex=5]")
    private WebElement themeInput;
    @FindBy(xpath = "//textarea[@tabindex=10]")
    private WebElement textLetterTxtArea;
    @FindBy(xpath = "//p[@class='send_container']/input[@name='send']")
    private WebElement sendBtn;

    protected void sendLetter(String email, String theme, String textLetter) {
        emailAddressInput.sendKeys(email);
        themeInput.sendKeys(theme);
        textLetterTxtArea.sendKeys(textLetter);
        sendBtn.click();

    }
}
