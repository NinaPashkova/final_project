package com.it.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.BASE_IMPLICITY_WAIT;
import static com.it.common.Constants.BASE_URL;

public class DriverFactory {
    public static final String USERNAME = "bsuser61473";
    public static final String AUTOMATE_KEY = "2sAXSAE3EHwcZyD193HX";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver getDriver() {
        WebDriver driver = null;
        String driverSysProperty = System.getProperty("driver");
        if ("firefox".equals(driverSysProperty)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("chrome".equals(driverSysProperty)) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("remote".equals(driverSysProperty)) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "80.0 beta");
            caps.setCapability("resolution", "2048x1536");
            caps.setCapability("browserstack.local", "false");
            caps.setCapability("browserstack.selenium_version", "2.53.0");
            try {
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else if ("ie".equals(driverSysProperty)){
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
        }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(BASE_IMPLICITY_WAIT, TimeUnit.SECONDS);
            driver.get(BASE_URL);
            return driver;


        // добавить таск браузерстек, и добавить 3 дравер в иф-элс и туда передавать браузерстек
    }
}
