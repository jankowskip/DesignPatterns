package model.command;

import model.Light;

public class CommandTurnOnLight implements Command {
	private Light light;

	public CommandTurnOnLight(Light light) {
		this.light = light;
	}

	public void execute() {
		light.turnOnLight();
	}

	@Override
	public void undo() {
		light.turnOffLight();

	}
}
