
public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish d = new Fish();
		d.setName("fgdfgdf");
		System.out.println(d.getName());
		d.play();
		d.walk();
		d.eat();
		Cat c = new Cat("Fluffy");
		System.out.println(c.getName());
		c.play();
		c.walk();
		c.eat();
		Animal a = new Fish();
		a.walk();
		a.eat();
		Animal e = new Spider();
		e.walk();
		e.eat();
		Pet p = new Cat();
		p.setName("fsdd");
		System.out.println(p.getName());
		p.play();
	}

}
