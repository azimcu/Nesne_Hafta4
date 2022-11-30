package polimorfizm;

public class Employee {
	protected String ayrac = "------------------------------------------";
	protected String name, surname, job;
	protected int salary, annualPermit;
	
	protected Employee (String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.job = "calisan";
		this.salary = 5500;
		this.annualPermit = 10;
	}
	
	protected Employee (String name, String surname, int salary) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.annualPermit = 10;
		
		if(salary > 6000) {
			this.job = "Kidemli Calisan";
			annualPermit += 3;
		}
		else if (salary > 0 && salary <= 6000) {
			this.job = "Calisan";
		}
		else {
			this.job = "Stajyer";
			annualPermit = 0;
		}
	}
	
	public int makeRaise(int howMuch) {
		salary += howMuch;
		return salary;
	}
	
	public int makeRaise(double howMuch) {
		double money = (double)salary*howMuch;
		makeRaise((int)money);
		return salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualPermit() {
		return annualPermit;
	}

	public void setAnnualPermit(int Permit) {
		this.annualPermit = Permit;
	}
	
	public void info() {
		System.out.println(getJob() + " Bilgileri \n" + ayrac + "\n Calisan ismi: " + name + "\n Calisan Soyismi: " 
		+ surname + "\n Gorevi: " + getJob() + "\n Maasi: " + getSalary() +  "\n Izin Gunu: " + getAnnualPermit() 
		+ " Is gunu \n" + ayrac);
	}
	
	public void raiseinfo() {
		System.out.println(getJob() + " Zam Uygulaması \n" + ayrac + "\nYeni verilecek maas: "
		+ getSalary() + "\n" + ayrac);
		
	}
}
