package com.koreait.second;

public class Sum {

	public static void main(String[] args) {
		int sum = sum(1,2); // 3
		System.out.println(sum);
		sum = sum(1,2,3); //6
		System.out.println(sum);
	    
				

	}

	public static int sum(int ...arr) {
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	

}
