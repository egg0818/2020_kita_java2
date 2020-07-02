package com.koreait.second;

public class Star {

	public static void main(String[] args) {
		
		String star = makeStarTriangle(5); //결과값  문자열로 넘기기
		System.out.print(star);
		// "*\n**\n**\n
		//*
		//**
		//***
		//****
		//*****
	}
	
	public static String makeStarTriangle(int num) {
		
		String temp = "";
		
		for(int i=0; i<num; i++) {
			for(int z=0; z<i+1; z++) {
				temp += "*";
			}
			temp +="\n";
		}
		
		
		return temp;
	}

}
