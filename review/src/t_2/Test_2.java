package t_2;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		int m,n;
		Scanner reder=new Scanner(System.in);
		System.out.println("请输入m的值");
		m=reder.nextInt();
		System.out.println("请输入n的值");
		n=reder.nextInt();
		System.out.println("最大公约数为"+gongyue(m,n)+"\n"+"最小公倍数为"+gongbei(m,n));
		
	}
	public static int gongyue(int n,int m){
		int i=1;
		int j=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0&&m%i==0)
				j=i;
		}
		return j;
		
	}
	public static int gongbei(int n,int m){
		return (n*m)/gongyue(n,m);
	}

	}


