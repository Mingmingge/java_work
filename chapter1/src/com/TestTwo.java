package com;

import java.util.Arrays;

public class TestTwo {

	public static void main(String[] args) {
		int[] a ;
		a = new int[]{1,2,3,4};
		int[] b ;
		b = new int[4];
		
//		for(int i = 0;i < a.length;i++)
//			System.out.println(a[i]);
		
		for(int x:a)
			System.out.println(x);
		
		int arr[][] ={{1,2,3},{4},{5,6,7,8}};
		int brr[][] ;
		brr = new int[3][];
		brr[0]= new int[3];
		brr[1] = new int[]{4};
		brr[2] = new int[4];
		
//		System.out.println(arr.length);
//		for(int i = 0;i < brr.length;i++)
//		{
//			for(int j = 0;j < brr[i].length;j++)
//				System.out.print(brr[i][j] + " ");
//			System.out.println();
//		}
		
		for(int[] x:arr)
		{
			for(int y:x)
				System.out.print(y + " ");
			System.out.println();
		}
		
		String str[] = {"ok","java","hello","china"};
		Arrays.sort(str);
		for(String s: str)
			System.out.println(s);

		
		
		
		
		

	}

}
