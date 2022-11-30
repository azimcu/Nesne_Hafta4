package hafta8Lab;

public interface Pet {
	
	void play();
	
	default String getName() {
		System.out.println("pet getName");
		return name;
	}
	default void setName(String name) {
		this.name = name;
	}

}
