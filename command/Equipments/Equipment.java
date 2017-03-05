package Equipments;

public abstract class Equipment {
	
	private String name;
	
	public Equipment(String name) {
		super();
		this.name = name;
	}

	public void on() {
		System.out.println( name + " " + getClass().getSimpleName() + " is on.");
		
	}

	public void off() {
		System.out.println(name + " " + getClass().getSimpleName()  + " is off.");
	}
}
