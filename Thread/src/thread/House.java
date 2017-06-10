package thread;

public class House implements Runnable{
	int cake;
	public void setCake(int c){
		cake=c;
	}

	@Override
	public void run() {
		int m=2;
		while(true){
			if(cake<0){
				System.out.println(Thread.currentThread().getName()+"进入死亡状态");
				return;
			}
			System.out.println(Thread.currentThread().getName()+"吃了"+m+"克");
			cake=cake-m;
			System.out.println("还剩"+cake+"克");
			try{
				Thread.sleep(0);
				
			}
			catch (Exception e){
				
			}
			
		}
		
		
	}
	

}
