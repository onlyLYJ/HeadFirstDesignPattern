
import Commands.*;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	private static final int BUTTOM_NUM = 7;
	private static Command noCommand = new NoCommand();


	public void setCommand(int slot, Command onCommand, Command offCommand) {
		checkSlot(slot);
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	private void checkSlot(int slot) {
		if (slot < 0 || slot >= BUTTOM_NUM )
			throw new IndexOutOfBoundsException("" + slot);
	}

	public RemoteControl() {
		onCommands = new Command[BUTTOM_NUM];
		offCommands = new Command[BUTTOM_NUM];
		
		setDefault(noCommand);
	}
	
	private void setDefault(Command noCommand2) {
		for (int i = 0; i < BUTTOM_NUM; i++){
			onCommands[i] = noCommand2;
			offCommands[i] = noCommand2;
		}
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n------ Remote Control -----\n");
		for (int i = 0; i < onCommands.length; i++) {
			sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()  
			+ "   " + offCommands[i].getClass().getName() + "\n");
		}
		
		return sb.toString();

	}
	
	
	
	
}
