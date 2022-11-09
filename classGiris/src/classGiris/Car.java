package classGiris;

public class Car {
	
	private String color;
	private String model;
	private double engine;
	private int hp;
	private int torque;
	
	public Car() {
		
		this.color = "no info";
		this.model = "no info";
		this.engine = 0;
		this.hp = 0;
		this.torque = 0;
	}
	
	public Car(String color, String model, double engine, int hp, int torque) {
	
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.hp = hp;
		this.torque = torque;
	}
	
	public void showInfos() {
		
		System.out.println("Arabanin rengi: " + this.color);
		System.out.println("Arabanin modeli: " + this.model);
		System.out.println("Arabanin motoru: " + this.engine);
		System.out.println("Arabanin beygiri: " + this.hp + " hp");
		System.out.println("Arabanin torku: " + this.torque + " N/m");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}
	
	

}
