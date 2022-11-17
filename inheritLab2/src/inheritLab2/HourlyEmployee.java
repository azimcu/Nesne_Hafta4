package inheritLab2;

public class HourlyEmployee extends Employee {
	
	protected HourlyEmployee(String isim, String soyisim, int tc, int hour, int wage) {
		super(isim, soyisim, tc);
		this.hour = hour;
		this.wage = wage;
	}

	
	protected int hour, wage;
	
	

	protected int getHour() {
		return hour;
	}

	protected void setHour(int hour) {
		this.hour = hour;
	}

	protected int getWage() {
		return wage;
	}

	protected void setWage(int wage) {
		this.wage = wage;
	}
	
	protected int earnings(int hour, int wage) {
		return hour * wage;
	}
	
	protected void write() {
		super.write();
		System.out.println("\nBilgileri yukarida verilen kisinin aylik kazanci:");
		System.out.println(earnings(hour, wage));
	}
}
