package model.command;

import model.Light;

public class CommandTurnOffLight implements Command {
	private Light light;

	public CommandTurnOffLight(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOffLight();

	}

	@Override
	public void undo() {
		light.turnOnLight();

	}

}
