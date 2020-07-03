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
				String deno;
				switch (z) {
				case 1:
					deno = "A";
					break;
				case 11:
					deno = "J";
					break;
				case 12:
					deno = "Q";
					break;
				case 13:
					deno = "K";
					break;
				default:
					deno = String.valueOf(z);
				}
				arr.add(new Card(Card.PATTERNS[i],deno));
			}
		}
	}

}
