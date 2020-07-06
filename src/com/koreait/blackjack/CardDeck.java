package com.koreait.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {

	// 제네릭 <Card> : 카드 객체 주솟값을 넣음
	private List<Card> arr = new ArrayList();

	public CardDeck() {
		init();
		
	}

	private void init() {
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int z = 1; z <= 13; z++) {
				//arr.add(new Card(Card.PATTERNS[i],getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z);
				int point = getPo(z);
				Card c = new Card(pattern, deno, point);
				arr.add(c);
			}
		}
	}
	private String getDeno(int num) {
		switch (num) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return String.valueOf(num);
		}
		
	}
	
	private int getPo(int num) {
		switch (num) {
		case 11: case 12: case 13: return 10;
		default: return num;
		}
	}
	
	//return num>10 ? 10: num;
	
	
	//랜덤값 뽑아서 리턴. 카드덱에서 삭제
	public Card getCard() {
		int a = (int)(Math.random()*arr.size()); // 인덱스로 랜덤값 받기
		Card temp = arr.get(a);
		arr.remove(a);
		return temp;
		
		// int a = (int)(Math.random()*arr.size());
		// return arr.remove(a)
		
	}
	
	/*
	@Override 
	public String toString() {
		for(Card c : arr) {
			System.out.println(c);
		}
		return "";
	}
	*/
	
	@Override
	public String toString() {
		String str="";
		for(Card c : arr) {
			str += (c + "\n");
		}
	
	return str;
	}

}
