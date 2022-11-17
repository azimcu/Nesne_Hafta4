package inherit;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person("Ahmet", "Canli", "ahmet_canli@gmail.com");
		
		System.out.println(p.getAdi() + " " + p.getSoyadi() + " " + p.giris());
		
		
		//akademik abstract olduğu için a nesnesi oluşturamadık
		//AkademikPersonel a = new AkademikPersonel("Ali", "Veli", "Veli@gmail.com", "Bilgisayar Muh.");
		//System.out.println(a.getAdi() + " " + a.getSoyadi() + " " + a.getDepartman() + " " + a.giris());	//a.giris person dan kalitımsal geldi
		
		 
		Hoca h = new Hoca("Hasan", "Huseyin", "Hasan@gmail.com", "Bilgisayar muh.", "Doc. Dr.");
		System.out.println(h.getUnvan() + " " + h.getAdi() + " " + h.getSoyadi() + " " + h.getDepartman() + " " + h.giris());
		
		
		Student s = new Student("Leyla", "Mecnun", "Leyla@gmail.com", 213450803);
		System.out.println(s.getAdi() + " " + s.getSoyadi() + " no: " + s.getOgr_id() + " " + s.giris());
		
		
		Hoca h2 = new Hoca("Hasan", "Huseyin", "Hasan@gmail.com", "Bilgisayar muh.", "Doc. Dr.");
		System.out.println(h2.getUnvan() + " " + h2.getAdi() + " " + h2.getSoyadi() + " " + h2.getDepartman() + " " + h2.cikis());
	}

}
