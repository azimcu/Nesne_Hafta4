package polimorfizm;

public class Main {

	public static void main(String[] args) {

		Employee Ahmet = new Employee("Ahmet","Mehmet");
		Employee Hasan = new Employee("Hasan","Huseyin",6500);
		Employee Leyla = new Employee("Leyla","Mecnun");
		Employee Ali = new Engineer("Ali","Veli",15001);
		Engineer Yasar = new Engineer("Yasar","Yasamaz");
		
		Ahmet.info();
		Hasan.info();
		Leyla.info();
		Ali.info();
		Yasar.info();
		

	}

}
