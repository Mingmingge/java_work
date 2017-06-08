package ioexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExp1 {

	public static void main(String[] args) {
//		byte[] buf = new byte[10];
//		int x = System.in.read(buf);
//		//System.out.println(new String(buf,0,x));
//		System.out.write(buf,0,x);
		
//		FileOutputStream fos = new FileOutputStream("e:\\a.txt");
//		fos.write("abc".getBytes());
//		fos.close();
		
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("e:\\Demo1.java");
			int x = 0;
			byte[] buf = new byte[1024];
			while((x= fis.read(buf))!= -1)
				System.out.write(buf,0,x);		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				if(fis!= null)
					fis.close();
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
		
		
	}

}
