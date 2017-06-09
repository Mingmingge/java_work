package io;
import java.io.*;
public class Tese_2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader re=new InputStreamReader(System.in);
		BufferedReader bre=new BufferedReader(re);
		String str="exit";
		String s=null;
		while(true)
			
		{
			s=bre.readLine();
			if((s!=null)&&!(s.equals(str)))
				System.out.println(s);
			else
				
				{
					System.out.println("Over!");
					break;
				}
			
		}
	}

}
