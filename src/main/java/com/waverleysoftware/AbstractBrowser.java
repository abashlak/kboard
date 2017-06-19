package com.waverleysoftware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by artembashlak on 6/17/17.
 */
public abstract class AbstractBrowser {

    protected WebDriver webDriver;

    private String virtualKey="//button[@class='key' and text()='%s']";
    void click(String elementPath){
        webDriver.findElement(By.xpath(elementPath)).click();
        //WebElement.findByXPath(elementPath);
        String output="Clicking "+elementPath+"  in a " +this.getClass().getSimpleName()+" browser";
        System.out.println(output);
    };

    protected String helper(){
        return RandomNum.generateNumber();
    }
}