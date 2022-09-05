package com.example.sushmitha;

import java.text.NumberFormat;
import java.util.Locale;

public class Formating_numerical_value_as_strings {

    public static void main(String[] args) {
    	
    	Locale locale = new Locale("da", "DK");

        double doubleValue = 1_234_567.89;
        
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));
        
        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));
    }

}
