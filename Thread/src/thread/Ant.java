package thread;

public class Ant extends Thread {
	Cake cake;
	public Ant(String name,Cake a){
		setName(name);
		cake=a;
	}
	public void run(){
		while(true){
			int n=2;
			System.out.println(getName()+"吃了"+n+"克！");
			cake.lost(n);
			System.out.println("蛋糕还有"+cake.getSize()+"克");
			try{
				sleep(1000);
			}
			catch (Exception e){
				System.out.println("出现问题了");
			}
			if(cake.getSize()<=0)
			{
				System.out.println(getName()+"进入死亡状态");
			}
			return;
			
		}
	}

}
