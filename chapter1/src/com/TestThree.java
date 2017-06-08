package com;

public class TestThree {

	public static void main(String[] args) {
		int sum= 0;
		for(int i = 0;i < 11;i++)
			for(int j = 0;j < 6;j++)
				for(int k = 0;k <3;k++)
				{
					if(i + 2*j + 4*k ==10)
					{
						System.out.println("苹果：" + i+"个，桔子：" + j + "个，芒果：" +k);
						sum++;
					}
					
				}
		System.out.println("sum=" + sum);
	}

}
