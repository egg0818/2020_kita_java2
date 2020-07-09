package com.koreait.second;

public class test {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7};
	
		
		try {
			System.out.println(arr[4]);
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");
		}
	}

}
