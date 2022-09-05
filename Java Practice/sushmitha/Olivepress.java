package com.example.sushmitha;

import java.util.List;

import model.Olive;

public class Olivepress {
	
	public int getOil(List<Olive> olives) {
		
		int totalOil = 0;
	 	for (Olive o : olives) {
    		System.out.println(o.getName());
    		totalOil += o.crush();
    	}
		return totalOil;
		 
	
	}

}
