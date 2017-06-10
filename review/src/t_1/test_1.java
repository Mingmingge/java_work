package t_1;

public class test_1 {

	public static void main(String[] args) {
		String str="Thank you,i like you,do you like me?";
		int location=0;
		int i=0;
		String s;
		location=str.lastIndexOf("you");
		char[] ch=new char[100];
		ch=str.toCharArray();
		for(char c:ch){
			if('k'==c){
				i++;
				
			}
			
		}
		s=str.substring(33,35);
		System.out.println("you最后一次出现"+location+"\n"+"k出现的次数"+i+"\n"+"已经截取"+s);

	}

}
