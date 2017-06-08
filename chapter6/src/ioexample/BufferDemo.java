package ioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("e:\\a.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello");
		bw.newLine();
		bw.write("hangzhou");
		bw.flush();
		bw.close();
		
//		fw.write("hello");
//		fw.flush();
//		fw.write("\r\n");
//		fw.write("hangzhou");
//		fw.close();
		
		
		BufferedReader br = new BufferedReader(
						new FileReader("e:\\a.txt"));
		String line = null;
		
		while((line = br.readLine())!= null)
			System.out.println(line);
		
		br.close();
		
	}

}
