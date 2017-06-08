package ioexample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("e:\\a.txt");
//		fw.write("hello");
//		fw.flush();
//		fw.write("world");
//		fw.close();
		FileWriter fw = null;
		FileReader fr = null;		
		try{
			fw = new FileWriter("e:\\copy2.java");
			fr = new FileReader("e:\\demo1.java");
			char[] buf = new char[1024];
			int len =0;
			while((len=fr.read(buf))!=-1)
			{
				//System.out.print(new String(buf,0,len));
				fw.write(buf,0,len);
				fw.flush();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try{
				if(fw!= null)
					fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
			try{
				if(fr!= null)
					fr.close();
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
				
		}

	}

}
