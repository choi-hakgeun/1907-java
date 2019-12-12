package h_api;

import java.util.Arrays;

public class Member implements Cloneable{ 
	public String id, name, password;
	public int    age;
	public boolean adult;
	public int[] scores;
	public Car car;
	
	
	public Member(String id, String name, String pa, int age, boolean ad) {
		this.id = id;
		this.name = name;
		this.password = pa;
		this.age = age;
		this.adult = ad;
		
		scores = new int[] {10, 20, 30};
		car = new Car("¹êÃ÷");
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member)clone();
			
			cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
			
			cloned.car = new car(this.car.model);
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return cloned;
	}
	
}
