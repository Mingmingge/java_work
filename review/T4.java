public class T4 {

	public static void main(String[] args) {
		int num = 0;
		for(int i = 5;i<=8;i++)
			for(int j = 0; j <=6; j++)
				for(int k = 0; k <=30; k++)
				{
					if(100*i + 50 * j + 10 * k == 800)
					{
						num++;
						System.out.println("100Ԫ��" + i + "��50Ԫ��" + j + "��10Ԫ��" + k);
					}
				}
		System.out.println("��" + num + "��������");
	}
}