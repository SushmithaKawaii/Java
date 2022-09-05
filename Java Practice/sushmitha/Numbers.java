package com.example.sushmitha;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
	
	public static void main(String[] args) {
		List<Integer> numbers = getNumbersInRange(0,101);
		System.out.println(numbers);
	}
	
	public static List<Integer> getNumbersInRange(int start, int end)
	{
		List<Integer> result = new
		ArrayList<>();
		int j=0;
		int temp = 0;
		int sum = 0;
			for (int i = 0; i < end; i++)
			{
					//result.add(i);
					if(sum == i) {
						j++;
						temp = j;
						sum = sum+j;
					}
					else {
						result.add(i);
					}
		    }
		return result;
	}
	
}

