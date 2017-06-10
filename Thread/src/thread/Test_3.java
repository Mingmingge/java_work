package thread;

public class Test_3 {

	public static void main(String[] args) {
		Bank bank=new Bank();
		Thread b1=new Thread(bank);
		Thread b2=new Thread(bank);
		bank.setMoney(200);
		b1.setName("会计");
		b2.setName("出纳");
		b1.start();
		b2.start();
		
	}

}
