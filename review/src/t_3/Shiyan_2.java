package t_3;
import java.util.*;
public class Shiyan_2 {

	public static void main(String[] args) {
		try{
			sum();
		}catch(NumberRangeException e){
			System.out.println(e.getMessage());
			
		}
	}
	public static void sum() throws NumberRangeException{
		double a;
		double b;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入正数a");
		a=reader.nextDouble();
		System.out.println("请输入正数b");
		b=reader.nextDouble();
		if(!((a>0&&a<=100)&&(b>0&&b<=100)))
			throw new NumberRangeException("您输入的数据超过范围（0～100）！");
		else
			System.out.println("两个数据之和为"+(a+b));
		
		
		
		
	}

}
