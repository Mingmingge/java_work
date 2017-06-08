package ioexample;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("e:\\aa\\bb\\cc");
		f.mkdirs();
		File f2 = new File(f,"1.txt");
		f2.createNewFile();
		//System.out.println(f.exists());
		System.out.println(f2.getParentFile());
		System.out.println(f2.getPath());

	}

}
