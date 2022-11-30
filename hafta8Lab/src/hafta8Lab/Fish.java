package hafta8Lab;

public class Fish extends Animal implements Pet {
	
	public Fish(int legs, String name) {
		super(legs);
		this.name = name;
	}

	protected String name;

	
	public void play() {
		System.out.println("Baliklar oyun oynamaz");
	}
	public void eat() {
		System.out.println("Baliklar yem yer");
	}
	public void walk() {
		System.out.println("Baliklar yuzer");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
