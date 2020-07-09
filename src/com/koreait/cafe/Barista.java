package com.koreait.cafe;

public class Barista {
	
	
	public Coffee makeCoffee(MenuItem choicemenu) {
		return new Coffee(choicemenu);
	}
}
