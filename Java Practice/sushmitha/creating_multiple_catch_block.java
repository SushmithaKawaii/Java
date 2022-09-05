package com.example.sushmitha;

public class creating_multiple_catch_block {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            char lastChar = chars[chars.length];
            System.out.println(lastChar);
            
            String sub = welcome.substring(10);
            
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
        	System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e) {
        	System.out.println("String index problem!");
        }

    }

}
