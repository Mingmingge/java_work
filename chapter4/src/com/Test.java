package com;

import banking.Account;

public class Test {

	public static void main(String[] args) {
//		Car c = new Car();
//		c.show();
//		
//		Student s = new Student();
//		s.show();
		
//		User u1 = new User("Jin", "123","jin@hdu.edu.cn");
//		System.out.println(u1.getEmail());
//		System.out.println(u1.getNum());
//		
//		User u2 = new User("a", "123");
//		System.out.println(User.getNum());
//		u2.print();
//		
////		banking.Account ac = new banking.Account(100);
//		Account ac = new Account(100);
		
		Student s1 = new Student("Tom",1);
		Student s2 = new Student("Tom",1);
		
		if(s1.equals(s2))
			System.out.println("s1==s2");
		else {
			System.out.println("s1!=s2");
		}


	}

}
