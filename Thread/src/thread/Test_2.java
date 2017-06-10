package thread;

public class Test_2 {

	public static void main(String[] args) {
		House house=new House();
		house.setCake(10);
		Thread antOne,antTwo;
		antOne=new Thread(house);
		antTwo=new Thread(house);
		antOne.setName("蚂蚁1");
		antTwo.setName("蚂蚁2");
		antOne.start();
		antTwo.start();
	}

}
