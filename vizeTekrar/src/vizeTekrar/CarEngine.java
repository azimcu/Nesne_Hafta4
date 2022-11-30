package vizeTekrar;

public class CarEngine extends CarName {
	
	protected CarEngine(String marka, String model, String renk, String vites, double motor, double beygir, double tork) {
		super(marka, model);
		this.renk = renk;
		this.vites = vites;
		this.motor = motor;
		this.beygir = beygir;
		this.tork = tork;
	}
	
	
	protected String renk, vites;
	protected double motor, beygir, tork;
	
	
	protected String getRenk() {
		return renk;
	}
	protected void setRenk(String renk) {
		this.renk = renk;
	}
	protected String getVites() {
		return vites;
	}
	protected void setVites(String vites) {
		this.vites = vites;
	}
	protected double getMotor() {
		return motor;
	}
	protected void setMotor(double motor) {
		this.motor = motor;
	}
	protected double getBeygir() {
		return beygir;
	}
	protected void setBeygir(double beygir) {
		this.beygir = beygir;
	}
	protected double getTork() {
		return tork;
	}
	protected void setTork(double tork) {
		this.tork = tork;
	}
	
	protected void yazdir() {
		super.carName();
		System.out.println("Renk: " + renk + "\nVites: " + vites);
		System.out.println("Motor: " + motor + "\nBeygir: " + beygir + "bg" + "\nTork: " + tork + "N/m");
	}
	
}
