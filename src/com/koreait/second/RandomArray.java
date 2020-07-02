package com.koreait.second;

public class RandomArray {

	public static void main(String[] args) {
		
		int[] rArr = Utils.createRandomArr(5,15,5);
		int[] rArr2 = Utils.createRandomND(1,5,7); 
		
		Utils.printArr(rArr2);
		

	}

}

