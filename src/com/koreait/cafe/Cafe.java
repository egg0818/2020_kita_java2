package com.koreait.cafe;

public class Cafe {

	public static void main(String[] args) {
//		MenuItem mi = new MenuItem("아메리카노", 1500);
//		MenuItem mi2 = new MenuItem("카푸치노", 2000);
//		System.out.println(mi);
//		System.out.println(mi2);
		
		Menu menu = new Menu();
		menu.showMenus();
		
		MenuItem mi = menu.choose(0);
		System.out.println(mi);
		// 아메리카노 1,500원 객체가 넘어와야함
		
	}

}

