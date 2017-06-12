package t_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class T11 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter(".\\src\\exe11.txt"));
		
		String line = null;
		
		while(true)
		{			
			System.out.println("请输入电话号码及姓名，中间用逗号分隔：");
			line = br.readLine();
			if("down".equalsIgnoreCase(line))
				break;
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		
		br = new BufferedReader(new FileReader(".\\src\\exe11.txt"));
		int num = 1;		
		while((line=br.readLine())!=null){
			System.out.println(num + ":" + line);
			num++;
		}

		br.close();
	}
}
