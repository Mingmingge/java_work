package io;
import java.io.*;
public class Test_1 {

	public static void main(String[] args) throws IOException{
		FileInputStream in=new FileInputStream("/Users/hulimin/git/java_work/java.io/src/test_1.md");
		File f2=new File("test_2.md");
		FileOutputStream ou=new FileOutputStream(f2);
		byte []by=new byte[1024];
		int len=in.read(by);
		while(len!=-1)
		{
			ou.write(by);
			len=in.read(by);
		}
		
		in.close();
		ou.close();
	}

}
