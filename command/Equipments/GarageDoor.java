package Equipments;

public class GarageDoor extends Equipment {

	public GarageDoor(String name) {
		super(name);
	}

	public void open() {
		System.out.println("GarageDoor opened.");
	}

	public void close() {
		System.out.println("GarageDoor closed.");
		
	}

}
