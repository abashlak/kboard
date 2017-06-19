package com.waverleysoftware;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by artembashlak on 6/17/17.
 */
public class Firefox extends AbstractBrowser {

    public Firefox() {
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        this.webDriver  = new FirefoxDriver(capabilities);
        this.webDriver.get("https://abashlak.github.io/keyboard/");
       // webDriver.quit();
    }
}
