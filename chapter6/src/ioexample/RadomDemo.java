package ioexample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.SeekableByteChannel;
import java.util.Scanner;

public class RadomDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("e:\\rand.txt","rw");
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 5;i++)
		{
			int num = sc.nextInt();
			raf.writeInt(num);
		}
		
		raf.seek(8);
		raf.writeDouble(99.0);
		
		raf.seek(0);
		
		for(int i = 0;i < 2;i++)
		{
			System.out.println(raf.readInt());
		}
		System.out.println(raf.readDouble());
		
		long pos = raf.getFilePointer();
		long end = raf.length();	
		while(pos < end)
		{
			System.out.println(raf.readInt());
			pos = raf.getFilePointer();
		}
		
		raf.close();

	}

}
