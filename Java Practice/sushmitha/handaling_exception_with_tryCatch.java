package com.example.sushmitha;

public class handaling_exception_with_tryCatch {

    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
			char lastChar = chars[chars.length];
			System.out.println("Last character: " + lastChar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
