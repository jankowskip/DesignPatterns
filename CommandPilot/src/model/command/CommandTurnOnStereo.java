package model.command;

import model.Stereo;

public class CommandTurnOnStereo implements Command {
	private Stereo stereo;

	public CommandTurnOnStereo(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.turnOnStereo();

	}

	public void undo() {
		stereo.turnOffStereo();
	}
}
