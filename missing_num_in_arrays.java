package com.Shivam.Core_java_basic;

import java.util.Arrays;

// find the missing number 
// 0-n number 

public class missing_num_in_arrays {
	public static void main(String[] args) {        
      int[] arr= {2,0,1,4};
      int sumOfElement=arr[arr.length-1]*(arr[arr.length-1]+1)/2;
	  int sumOfArrays = Arrays.stream(arr).sum();	
	  int missingNumber=sumOfElement-sumOfArrays;
	  System.out.println("missing number is : "+missingNumber);
		
	}
}
