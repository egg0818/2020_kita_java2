package com.koreait.second;

public class ParseMission {
	
	public static void main(String[] args) {

		int result = Utils.parseStringToInt("10", 0); // 10정수값 리턴
		System
		.out.println(result);
		result = Utils.parseStringToInt("aa10", 1); // 파싱할 수 없을 때 두번째 인자값 리턴
		System.out.println(result);
		result =  Utils.parseStringToInt("aa10");
		System.out.println(result);

	}

}
