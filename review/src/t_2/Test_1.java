package thread;

public class Test_1 {
	public static void main(String[] args) {
		Cake cake=new Cake();
		int size=10;
		cake.setSize(size);
		Ant antRed=new Ant("红蚂蚁",cake);
		Ant antBlack=new Ant("黑蚂蚁",cake);
		antRed.start();
		antBlack.start();
		
		
	}

}
