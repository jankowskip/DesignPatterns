package model.command;

import model.Jacuzzi;

public class CommandTurnOnJacuzzi implements Command {
	private Jacuzzi jacuzzi;

	public CommandTurnOnJacuzzi(Jacuzzi jacuzzi) {
		this.jacuzzi = jacuzzi;
	}

	@Override
	public void execute() {
		jacuzzi.turnOnJacuzzi();
	}

	@Override
	public void undo() {
		jacuzzi.turnOffJacuzzi();
	}
}