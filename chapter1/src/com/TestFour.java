package com;

import java.util.Scanner;

public class TestFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int num  = sc.nextInt();
//		
//		while(num!=0)
//		{
//			System.out.print(num%10);
//			num /=10;
//		}
		
		String x = sc.next();
		for(int i = x.length()-1;i>=0;i--)
			System.out.print(x.charAt(i));
	}

}
