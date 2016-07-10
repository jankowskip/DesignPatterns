package model.command;

import model.GarageDoors;

public class CommandCloseGarageDoors implements Command {
	private GarageDoors garageDoors;

	public CommandCloseGarageDoors(GarageDoors garageDoors) {
		this.garageDoors = garageDoors;
	}

	@Override
	public void execute() {
		garageDoors.garageDoorsDown();

	}

	public void undo() {
		garageDoors.garageDoorsUp();
	}

}
