package zaman;

public class Time1 {
	
	private int hour;
	private int minute;
	private int second;
	
	
	//source/generate con. using fields -> generate
	public Time1(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	
	//source/generate setters and getters -> generate
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	public int getSecond() {
		return second;
	}


	public void setSecond(int second) {
		this.second = second;
	}
	//----------------------------------
	
	public void setSaat(int saat, int dakika, int saniye) {
		
		if(hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			System.out.println("Girmis oldugunuz saat yanlistir");

		}
		this.hour = saat;
		this.minute = dakika;
		this.second = saniye;
	}
	
	public String display() {
		
		return String.format("%02d:%02d:%02d %s", getHour(), getMinute(), getSecond(), "zaman");
	}
	
}