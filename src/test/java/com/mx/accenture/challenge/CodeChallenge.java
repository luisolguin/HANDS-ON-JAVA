package com.mx.accenture.challenge;

import java.util.ArrayList;

public class CodeChallenge {
	public Integer[]  resolve(Integer[] numbers, Integer target){
    	if(numbers.length==0) {
    		return null;
    	}
        Integer[] solution = new Integer[0];
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
          int currentSum = 0;
          result.clear();
          for (int j = i; j < numbers.length; j++) {
            currentSum += numbers[j];
            result.add(numbers[j]);
            if (currentSum == target) {
            	solution=(Integer[]) result.toArray();
              return solution;
            }
          }
        }
        return null;

    }
}
