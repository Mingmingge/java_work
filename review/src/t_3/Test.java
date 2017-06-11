package t_3;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		double redis=0;
		System.out.println("请输入一个double型的数据");
		try{
			redis=reader.nextDouble();
		}catch (Exception e){
			System.out.println("您输入的并非double数据！");
			System.exit(0);
		}
		System.out.println("圆的面积为："+(3.14*redis*redis));
		
				

	}

}
