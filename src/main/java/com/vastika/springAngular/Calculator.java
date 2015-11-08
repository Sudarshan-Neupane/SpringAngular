package com.vastika.springAngular;

public class Calculator {
	public int abs(int arg) {
		System.out.println(-arg);
		if(arg<0){
			return -arg;
		}
		else{
			return arg;
		}
	}
}
