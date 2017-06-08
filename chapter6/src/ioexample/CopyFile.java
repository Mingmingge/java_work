package ioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try{
			br = new BufferedReader(new FileReader("e:\\a.txt"));
			bw = new BufferedWriter(new FileWriter("e:\\b.txt",true));
			
			String line = null;
			int num = 1;
			
			while((line = br.readLine()) != null)
			{
				bw.write(num+ ":");
				bw.write(line);
				bw.newLine();
				bw.flush();
				num++;
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException("复制文件失败");
		}
		finally{
			try{
				if(br != null)
				{
					br.close();
				}
			}
			catch(IOException e)
			{
				throw new RuntimeException("关闭读取文件失败");
			}
			try{
				if(bw != null)
				{
					bw.close();
				}
			}
			catch(IOException e)
			{
				throw new RuntimeException("关闭写入文件失败");
			}
		}

	}

}
