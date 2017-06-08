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
			throw new RuntimeException("�����ļ�ʧ��");
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
				throw new RuntimeException("�رն�ȡ�ļ�ʧ��");
			}
			try{
				if(bw != null)
				{
					bw.close();
				}
			}
			catch(IOException e)
			{
				throw new RuntimeException("�ر�д���ļ�ʧ��");
			}
		}

	}

}
