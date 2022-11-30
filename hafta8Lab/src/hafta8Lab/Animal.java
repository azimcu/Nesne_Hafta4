package hafta8Lab;

public class Animal {
	
	public Animal(int legs, String name) {
		super();
		this.legs = legs;
		this.name = name;
	}

	public int legs;
	public String name;

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("Hayvanlar yurur");
	}
	public void eat() {
		System.out.println("Hayvanlar yer");
	}

}
