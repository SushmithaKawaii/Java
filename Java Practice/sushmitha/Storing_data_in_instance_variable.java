package com.example.sushmitha;

import java.util.ArrayList;
import java.util.List;

import model.Kalamata;
import model.Olive;
import model.OliveColor;
import model.OliveName;
import model.Test;

public class Storing_data_in_instance_variable {

    public static void main(String[] args) {
    	
    	Test test  = new Test();
    	
    	List<Olive> olives = new ArrayList<Olive>();
    	olives.add(new Kalamata());
    	olives.add(new Kalamata()); 
    	olives.add(new Olive(test.getName(), test.getColor(), 2));
    	olives.add(new Olive(test.getName(), test.getColor(), 2));
    	olives.add(new Olive(test.getName(), test.getColor(), 2));
    	olives.add(new Olive(test.getName(), test.getColor(), 2));
    	
    	Olivepress press = new Olivepress();
    	int totalOil = press.getOil(olives);
    	System.out.println("Total olive oil: " + totalOil);
    	
    	
    	
   
    	
    	


    }

}

