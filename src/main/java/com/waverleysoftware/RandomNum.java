package com.waverleysoftware;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNum {
    public static String generateNumber(){
      /*  String countryCode, mobileOperator, phoneNumber;
        countryCode= RandomStringUtils.randomNumeric(1,4);
        mobileOperator=RandomStringUtils.randomNumeric(3);
        phoneNumber=RandomStringUtils.randomNumeric(7,10);
        String number= "+" + countryCode + " ("+ mobileOperator+") " + phoneNumber;
        System.out.println(number);
        return number;*/
        return RandomStringUtils.randomNumeric(11,13);
    }

}
