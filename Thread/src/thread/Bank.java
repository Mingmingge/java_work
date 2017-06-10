package thread;

public class Bank implements Runnable {
	int money=200;
	public void setMoney(int n){
		money=n;
		
	}
	
	public void run(){
		if(Thread.currentThread().getName().equals("会计")){
			saveOrTake(300);
		
		}
		else
		{
			if(Thread.currentThread().getName().equals("出纳"))
				saveOrTake(150);
		}
	}
	public synchronized void saveOrTake(int n){
		if(Thread.currentThread().getName().equals("会计"))
		{
			for(int i=1;i<=3;i++){
			money=money+n/3;
			System.out.println(Thread.currentThread().getName()+"存入了"+n/3+"账上有"+money);
			try{
				Thread.sleep(1000);
				
			}catch (Exception e){
				System.out.println("出错了");
			}
			}
			
		}
		else
		{
			if(Thread.currentThread().getName().equals("出纳"))
			{
				for(int i=1;i<=3;i++){
					money=money-n/3;
					System.out.println(Thread.currentThread().getName()+"取出"+n/3+"账上还有"+money);
				}
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					System.out.println("出错了");
				}
			}
		}
		
		
	}

}
