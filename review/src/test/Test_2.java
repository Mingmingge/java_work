package test;
import java.util.*;
public class Test_2 {

	public static void main(String[] args) {
		int a;
		int[] ar={1,3,2,4,5,6,7};
		//Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个整型数据！");
		/*try{
			a=reader.nextInt();
		}catch(Exception e){
			a=1;
			System.out.println();
			System.exit(0);
		}*/
		a=reader.nextInt();
		System.out.println(Arrays.binarySearch(ar, a));
		

	}

}
