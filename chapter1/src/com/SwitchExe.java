package com;

import java.util.Scanner;

public class SwitchExe {

	public static void main(String[] args) {
		int year ,month,day;
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
		
		int today = 0;
		switch(month-1)
		{
		case 11:today += 30;
		case 10:today += 31;
		case 9:today += 30;
		case 8:today += 31;
		case 7:today += 31;
		case 6:today += 30;
		case 5:today += 31;
		case 4:today += 30;
		case 3:today += 31;
		case 2:
			if(year%400==0||(year%4==0&&year%100!=0))
				today += 29;
			else today += 28;
		default: today += 31;
		}
		today += day;
		System.out.println(today);

	}

}
