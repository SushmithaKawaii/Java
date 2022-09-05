package com.example.sushmitha;
import java.util.List;
import java.util.stream.*;
import java.lang.Math;

public class number {
	
	public static void main(String[] args) {
		  
		
		/*
		 * Stream.iterate(1, element->element+1) .filter(element->element%1==0)
		 * .limit(100) .forEach(System.out::println);
		 */ 
		
		int max = 100;
		int value = (8*max)-1;
		int x = (int) (1+Math.sqrt(value))/2;
				
		
		List<Integer> range = IntStream.range(1, 100).boxed().collect(Collectors.toList());
		
		List<Integer> filter = IntStream.range(1, x).boxed().collect(Collectors.toList());
		
		
		/*
		 * Integer temp = 0; int j = 0; for(Integer i : filter) { temp = temp+i;
		 * filter.set(j, temp); j++; }
		 */
		
		System.out.print(x);
		//System.out.print(range);
		  
	}

}
