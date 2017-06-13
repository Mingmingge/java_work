package t_9;

import java.util.HashSet;

class  Worker
{
	private String name;
	private int age;
	private double salary;
	
	public Worker(String name,int age,double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String toString()
	{
		return name + "," + age + "," + salary;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + 39 * age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return this.name.equals(other.name) && this.age == other.age;
	}	
}

public class T9 {

	public static void main(String[] args) {
		HashSet<Worker> hset = new HashSet<Worker>();
		hset.add(new Worker("w1", 21, 2000));
		hset.add(new Worker("w2", 22, 2200));
		hset.add(new Worker("w3", 20, 5000));
		hset.add(new Worker("w1", 21, 1000));
		hset.add(new Worker("w2", 22, 2200));
		
		for(Worker w : hset)
			System.out.println(w);
	}
}