package com.waverleysoftware;

public class EntryPoint {
    private static final String VIRTUAL_KEY="//button[@class='key' and text()='%s']";

    public static void main(String[] args) {
        AbstractBrowser chrome = new Chrome();
          AbstractBrowser firefox = new Firefox();

     String[] strarr = firefox.helper().split("");
        for (String digit : strarr) {
            firefox.click(String.format(VIRTUAL_KEY,digit));
        }
        String[] strarr2 = chrome.helper().split("");
        for (String digit : strarr2) {
            chrome.click(String.format(VIRTUAL_KEY,digit));
        }
    }}