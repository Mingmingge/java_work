package interfacedemo;

public class C implements A, B {

	@Override
	public void fun2() {
		System.out.println("A.NUM=" + A.NUM);

	}

	@Override
	public void fun1() {
		System.out.println("B.NUM = " + B.NUM);

	}

}
