package com.koreait.second;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] arr = {4, 5, 11, 223, 3, 10};
		
		Utils.sortASC(arr); // 오름차순 정렬
		Utils.printArr(arr); // [3,4,5,10,11,223]
		Utils.sortDESC(arr); // 내림차순 정렬
		Utils.printArr(arr); // [223,11,10,5,4,3]

	}

}
