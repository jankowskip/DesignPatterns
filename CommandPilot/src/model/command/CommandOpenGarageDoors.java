package model.command;

import model.GarageDoors;

public class CommandOpenGarageDoors implements Command {
	private GarageDoors garageDoors;

	public CommandOpenGarageDoors(GarageDoors garageDoors) {
		this.garageDoors = garageDoors;
	}

	@Override
	public void execute() {
		garageDoors.garageDoorsUp();

	}

	public void undo() {
		garageDoors.garageDoorsDown();
	}

}
