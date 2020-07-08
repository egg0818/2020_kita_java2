// 클래스명은 항상 대문자로. 그래야 첫글자가 대문자인 애들은 레퍼런스 변수라는 명제가 안깨짐. 
// 클래스는 붕어빵틀, 객체화는 붕어빵
// 클래스의 구성 - 멤버필드(속성, 값저장용), 메소드.
// 멤버필드의 은닉화(private) - 
// 메소드는 대문자로 시작하면 안됨


package com.koreait.cafe;

public class MenuItem {
	private String name;
	private int price; // String형 보단 int형이 낫다
	
	
	public MenuItem (String name, int price) { // 항구개방이라 생각하자!
		this.name = name; //파라미터의 변수값 이름이 똑같아서 this쓰는거임
		this.price = price;
	}
	
	
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	
	// println 메소드를 활용한것. 
	@Override				
	public String toString() { // println의 마지막 종착역, 오브젝트로부터 상속받은 메소드
		return String.format("%s \t\t %,d원", name, price);
	}

	
}
