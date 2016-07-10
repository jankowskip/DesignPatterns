package model.command;

import model.Jacuzzi;

public class CommandTurnOffJacuzzi implements Command {
	private Jacuzzi jacuzzi;

	public CommandTurnOffJacuzzi(Jacuzzi jacuzzi) {
		this.jacuzzi = jacuzzi;
	}

	@Override
	public void execute() {
		jacuzzi.turnOffJacuzzi();

	}

	@Override
	public void undo() {
		jacuzzi.turnOnJacuzzi();
	}

}
