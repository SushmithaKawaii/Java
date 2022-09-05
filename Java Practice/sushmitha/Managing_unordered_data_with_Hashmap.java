package com.example.sushmitha;

import java.util.HashMap;
import java.util.Map;

public class Managing_unordered_data_with_Hashmap {

    public static void main(String[] args) {
    	
    Map<String, String> map = new HashMap<>();
    
    map.put("California", "Sacramento");
    map.put("Oregon", "Salem");
    map.put("Washigton", "Olympia");
    System.out.println(map);
    
    map.put("Alaska", "Juneau");
    System.out.println(map);
    
    String cap = map.get("Oregon");
    System.out.println("The capitol of Oregon is " + cap);
    
    map.remove("California");
    System.out.println(map);

		

    }

}
