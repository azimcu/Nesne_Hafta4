package vizeTekrar;

public class CarName {

	protected CarName(String marka, String model) {
		super();
		this.marka = marka;
		this.model = model;
	}
	
	
	protected String marka, model;

	
	protected String getMarka() {
		return marka;
	}
	protected void setMarka(String marka) {
		this.marka = marka;
	}
	protected String getModel() {
		return model;
	}
	protected void setModel(String model) {
		this.model = model;
	}
	
	protected void carName() {
		System.out.println("---- Arac Bilgileri ----");
		System.out.println("Marka: " + marka + "\nModel: " + model);
	}
}
