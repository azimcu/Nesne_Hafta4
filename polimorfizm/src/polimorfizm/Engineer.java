package polimorfizm;

public class Engineer extends Employee{
	Engineer (String name, String surname) {
		super(name,surname);
		setJob("muhendis");
		setAnnualPermit(30);
		setSalary(12500);
	}
	Engineer(String name, String surname, int salary) {
		super(name,surname);
		setSalary(salary);
		if(salary > 12500) {
			setJob("Yuksek Muhendis");
			setAnnualPermit(35);
		}
		else if(salary > 15000) {
			setJob("Kidemli Yuksek Muhendis");
			setAnnualPermit(40);
		}
		else {
			setJob("muhendis");
			setAnnualPermit(30);
		}
	}

}
