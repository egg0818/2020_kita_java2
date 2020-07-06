package com.koreait.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	
	private List<Card> arr = new ArrayList();
	
	public void receiveCard(Card card) {
		arr.add(card);
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : arr) {
			sum += c.getPoint();
		}
		
		return sum;
	}
	
	public void openCards() {
		
		int sum = 0;
		
		/*
		for(int i=0; i<arr.size(); i++) {
			
			System.out.printf("p:%s\t d:%s\t po:%d\n", arr.get(i).getPattern(),
					arr.get(i).getDenomination(), arr.get(i).getPoint());
		sum += arr.get(i).getPoint();
		}
		
		System.out.printf("점수:%d\n", sum);
		*/
		
		for(Card c : arr) {
			System.out.println(c);
		}
		
			System.out.printf("점수:%d\n", getTotalPoint());
		}
		
	
}
