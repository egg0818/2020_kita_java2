package com.koreait.blackjack;

public class Card {
	// 프라이빗에 값넣기 1.세터  2.생성자// 뺄땐  1.게터
	// String 한 이유 : A,J도 넣어여함
	public static String[] PATTERNS = {"스페이드", "하트", "클로버", "다이아"};
	private final String pattern;  //무늬  //final 넣는게 좋음 (세터가안됨)
	private final String denomination; //입력값
	private final int point;
	
	
	
	// 세터 대신 생성자로 값넣는이유 : 값이 변하면 안되기 때문에!!! (세터는 값이 변함)
	// 세터는 계속 값을 바꿀 수 있음!!!
	// 생성자와 메소드 다른점 2가지 : 1.클래스명과 이름이같다, 2.리턴타입을 적으면 안됨!! 
	
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
	public String getPattern() {
		return pattern;
	}

	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	@Override // 없어도 되는데 확인용
	public String toString() {
		return String.format("p: %s, d: %s po: %d", pattern, denomination, point);
	}

}
