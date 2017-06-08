package ioexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BridgeDemo {

	public static void main(String[] args) throws IOException {
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("e:\\utf.txt"),"utf-8");
//		osw.write("ÄãºÃ");
//		osw.close();
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("e:\\gbk.txt"),"utf-8");
		char[] buf = new char[10];
		int len = isr.read(buf);
		System.out.println(new String(buf,0,len));
		isr.close();
		

	}

}
