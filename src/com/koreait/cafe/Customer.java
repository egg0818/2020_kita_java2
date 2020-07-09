package com.koreait.cafe;

import java.util.Scanner;

public class Customer {
	Scanner scan = new Scanner(System.in);

	public MenuItem order(Menu menu) {

		menu.showMenus();

		while (true) {

			try {
				System.out.println("몇번 커피를 마시겠습니까?");
				String menuNO = scan.nextLine();
				int intmenuNO = Integer.parseInt(menuNO);
				return menu.choose(intmenuNO-1);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요");
			} catch (Exception e) {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}

		}

	}


}
