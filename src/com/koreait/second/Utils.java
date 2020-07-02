package com.koreait.second;

import java.util.Arrays;

public class Utils {
	
	// 파세
	public static int parseStringToInt(String n1, int n2) {

		try {						
			return Integer.parseInt(n1);  // parseInt - 문자형(숫자) 정수형으로 바꿔줌
		} catch (Exception e) {
			return n2;
		}

	}
	
	public static int parseStringToInt(String n1) {

		return parseStringToInt(n1,0);
	}
	
	//------------------------------------------------------
	// 정렬
	public static int[] sort(int[] arr, boolean asc) {
		for(int i=0; i<arr.length-1; i++) {
			for(int z=i+1; z<arr.length; z++) {
				if(asc == (arr[i]>arr[z])) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] sortASC(int[] arr) {
		return sort(arr, true);
	}
	
	public static int[] sortDESC(int[] arr) {
		return sort(arr, false);
	}
	
	
	
	public static void printArr(int[] arr) {
		
		if (arr != null) {
		System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("arr is null");
		}
		
	}
	
	
	// 랜덤 값 뽑기
	//--------------------------------------
	
	public static int[] createRandomArr(int str, int end, int len) {
		
		int[] arr = new int[len];
		
		for (int i=0; i<len; i++) {
			arr[i] = (int) (Math.random()*(end-str+1)) + str;
		}
		
		return arr;
	}
	
	public static int[] createRandomND(int str, int end, int len) {
		
		int[] arr = new int[len];
	
		if(len > end-str+1) {
			return null;
		}
		

			for (int i=0; i<len; i++) {
				arr[i] = (int) (Math.random()*(end-str+1)) + str;
				for(int z=0; z<i; z++) {
					if(arr[i] == arr[z]) {
						i--;
						break;
					}
				}
			}
			
			
			return arr;
		
		
	}
		
}


