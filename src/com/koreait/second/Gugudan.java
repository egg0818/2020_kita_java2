package com.koreait.second;

public class Gugudan {
	public static void main(String[] args) {

		gugudan(2, 5); // 앞에 아무것도 안적었으니 이 메소드는 같은 클래스에 있을 확률이 높다.

	}

	/*
	 * static void gugudan(int num1) { for(int z=1; z<=9; z++) {
	 * System.out.printf("%d x %d = %d \n",num1,z,num1*z); } }
	 * 
	 * static void gugudan(int num1, int num2) { for(int i=num1; i<=num2; i++) {
	 * gugudan(i); } }
	 * 
	 * 
	 * }
	 */

	// 짝수만 나오게!!
	static void gugudan(int num1, int num2) {
		for (int i = num1; i <= num2; i++) {
			for (int z = 1; z <= 9; z++) {
				if ((i * z) % 2 == 0) {
					System.out.printf("%d x %d = %d\n", i, z, i * z);
				}
			}
			System.out.println();
		}
	}
}
