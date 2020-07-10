package com.koreait.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<MenuItem> menus = new ArrayList();

	public Menu() {
		init();
	}

	public void init() {
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜마끼야또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));
	}

	public void showMenus() {
		System.out.println("Menu");
		for (int i = 0; i < menus.size(); i++) {
			MenuItem mi = menus.get(i);
			System.out.printf("%d. %s\n", (i + 1), mi);
		}
	}
	
	public MenuItem choose (int idx) {

		System.out.println(menus.get(idx));
		return menus.get(idx);
		
		
	}

}
