package interfacedemo;

public class sofa extends chair implements Lieable {

	@Override
	public void lie() {
		System.out.println("lie");
	}

	@Override
	public void seat() {
		System.out.println("seat");
	}

}
