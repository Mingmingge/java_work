package test;
import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException {
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		String str=null;
		while(true){
			str=br.readLine();
			if(!("ok".equals(str))){
				System.out.println(str+"  ");
			}
			else{
				System.out.println("您确定输入完成了吗？");
				System.exit(0);
			}
		}
		
	}

}
