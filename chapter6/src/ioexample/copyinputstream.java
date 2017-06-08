package ioexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyinputstream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("e:\\1.jpg");
		FileOutputStream fos = new FileOutputStream("e:\\copy1.jpg");
		
		byte[] buf = new byte[1024];
		int len = 0;
		
		while((len = fis.read(buf))!=-1)
			fos.write(buf,0,len);
		
		fis.close();
		fos.close();

	}

}
