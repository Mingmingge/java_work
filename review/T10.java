import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class T10 {

	public static void copyFile(File srcFile,File tagFile) throws IOException{
		FileInputStream fis = new FileInputStream(srcFile);
		FileOutputStream fos = new FileOutputStream(tagFile);
		
		byte[] buf = new byte[1024];
		int len = 0;
		
		while((len = fis.read(buf))!=-1)
			fos.write(buf,0,len);
		
		fis.close();
		fos.close();		
	}
	
	public static void main(String[] args) throws IOException {
		
		String src;
		String tag;
		Scanner scanner  = new Scanner(System.in);
		System.out.println("请输入copy源文件：");
		src = scanner.nextLine();
		
		System.out.println("请输入copy目的文件：");
		tag = scanner.nextLine();
		
		File srcFile = new File(src);
		if(!srcFile.exists())
		{
			System.out.println("源文件" + src + "不存在");
			return;
		}
		File tagFile = new File(tag);
		if(!tagFile.exists())
		{
			tagFile.createNewFile();
		}
		
		copyFile(srcFile, tagFile);
		
	}
}
