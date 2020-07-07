package com.koreait.blackjack;

public class Dealer extends Gamer {
	public void moreCards(CardDeck cd) {
		// 딜러가 가지고 있는 카드의 합계점수가 17점 이상이 될 때까지
		// 카드 뽑기를 해야합니다.

		while (getTotalPoint() < 17) {
			receiveCard(cd.getCard());
		
		}
	}
}
