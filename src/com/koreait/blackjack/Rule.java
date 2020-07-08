package com.koreait.blackjack;

public class Rule {

	public static void whoIsWin(Gamer gamer, Dealer dealer) {

		int GP = gamer.getTotalPoint();
		int DP = dealer.getTotalPoint();
		
		
		if (GP<=21) {
			if (GP>DP) {
			 	System.out.println("WIN");
			} else if (DP>21) {
			 	System.out.println("WIN");
			} else if (DP>GP && DP<=21) {
			 	System.out.println("LOSE");
			}
			else if (GP==DP) {
			 	System.out.println("DRAW");
			}
		}else {
			if(DP>21) {
			 	System.out.println("DRAW");
			}else {
			 	System.out.println("LOSE");
			}
		}
			
			
			
//			
//		}  else if (GP<DP) {
//			System.out.println("LOSE");
//		} else if (GP>21) {
//			System.out.println(DP<=21 ? "LOSE" : "DRAW");
//			
//		} 
	}

}
