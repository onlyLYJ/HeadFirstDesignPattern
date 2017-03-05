package Commands;

import Equipments.GarageDoor;

public class GarageDoorCloseCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.close();
	}

}
