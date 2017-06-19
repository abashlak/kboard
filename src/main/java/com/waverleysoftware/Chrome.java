package com.waverleysoftware;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by artembashlak on 6/17/17.
 */
public class Chrome extends AbstractBrowser {

    public Chrome() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
       this.webDriver = new ChromeDriver();
        this.webDriver.get("https://abashlak.github.io/keyboard/");
       //this.webDriver.quit();
    }
}