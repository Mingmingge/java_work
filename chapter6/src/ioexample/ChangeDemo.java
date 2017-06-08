package ioexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String line = null;
		
		while(true)
		{
			line = br.readLine();
			if("over".equals(line))
				break;
			System.out.println(line);
		}		
		
		br.close();
		
		

	}

}
