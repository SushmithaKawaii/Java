package com.example.sushmitha;

public class Throwing_custom_exception {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
        	
        	if (chars.length < 10) {
        		throw (new Exception("My custom message"));
        	}
        	
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index problem!");
        } catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

    }

}
