package com.koreait.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		// System.out.println(cd); // 모든카드를 프린트
		Card c = cd.getCard(); // 랜덤한 카드를 1장 리턴 and 카드덱에서 삭제
		
		
		Gamer gamer = new Gamer();
		Card card = cd.getCard();
		gamer.receiveCard(card); // 변수(8개)는 주솟값 저장 안함. 
		
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		
		gamer.openCards();

	}
	
	
}
