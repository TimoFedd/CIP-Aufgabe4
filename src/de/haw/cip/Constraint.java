package de.haw.cip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import de.haw.cip.Number;


public class Constraint {
	public List<Number> numbers = new ArrayList<Number>();  
	
	public void prepare() {
		/*
		int maxSize = -1;
		for (Number number : numbers) {
			if (number.getSize() > maxSize) {
				maxSize = number.getSize();
			}
		}
		for (Number number : numbers) {
			number.maxSize = maxSize;
		}
		*/
		
		
		//Reverse digits
		for(Number number : numbers){
			int idx = 0;
			char[] newArr = new char[number.digits.length];
			for (int i = number.digits.length - 1; i >= 0; i--) {
			   newArr[idx] = number.digits[i];
			   idx++;
			}
			
			number.digits = newArr;
		}
		
	}
}
