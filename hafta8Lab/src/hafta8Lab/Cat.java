package hafta8Lab;

public class Cat extends Animal implements Pet {
	
	public Cat(int legs, String name) {
		super(legs,name);
		this.name = name;
	}

	protected String name;

	
	public void play() {
		System.out.println("Kediler oyun oynar");
	}
	public void eat() {
		System.out.println("Kediler balik yer");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
