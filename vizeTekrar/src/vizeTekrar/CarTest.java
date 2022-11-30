package vizeTekrar;

public class CarTest {

	public static void main(String[] args) {

		CarEngine car1 = new CarEngine("Opel","Astra","Beyaz","6 Ileri Otomatik",1.6,136,320);
		car1.yazdir();
		
		CarEngine car2 = new CarEngine("Mercedes","c180","Siyah","8 Ileri Otomatik",2.0,180,450);
		car2.yazdir();
		
		CarEngine car3 = new CarEngine("BMW","5.25 Xdrive","Parlament Mavisi","8 Ileri Otomatik",2.5,177,300);
		car3.yazdir();
		
		CarEngine car4 = new CarEngine("Fiat","Doblo Premium+","Gri","5 Ileri Manuel",1.3,90,170);
		car4.yazdir();
		
	}

}
