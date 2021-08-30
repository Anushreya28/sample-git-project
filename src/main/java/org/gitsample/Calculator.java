package org.gitsample;

public class Calculator {
	
//Test Comment

	public static int add(int a, int b) {
		int sum = a + b;
		System.out.println("a:" + a + ",b:" + b + ",sum:" + sum);
		return sum;
	}
	
	public static int subtract(int a,int b){
		int sub = a - b;
		System.out.println("a:" + a +",b:"+ b +",sum:" +sub);
		return sub;
	}
	
	public static int multiply(int a,int b){
		int product= a * b;
		System.out.println("a:" + a +",b:"+ b + ",product:" +product);
		return product;
	}
	

	public static int divide(int a, int b){
		int result = a / b;
		System.out.println("a:" + a +",b:"+ b + ",product:" +product);
		return result;
	}
	


}
