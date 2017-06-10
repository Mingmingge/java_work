package answer;
public class T1 {

	public static void main(String[] args) {
		String str = "Thank you,i like you,do you like me?";
		
		System.out.println(str.lastIndexOf("you"));
		
		int num = 0;
		for(int i =0;i < str.length();i++)
		{
			if(str.charAt(i) == 'k')
				num++;
		}
		System.out.println("k������" + num + "��");
		System.out.println(str.substring(33, 35));
	}
}