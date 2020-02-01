package com.it.pages;

import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected MyDriver driver = MyDriver.getMyDriver();
    protected Logger log = Logger.getLogger(this.getClass().getName());
    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
