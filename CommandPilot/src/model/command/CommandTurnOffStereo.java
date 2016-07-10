package model.command;

import model.Stereo;

public class CommandTurnOffStereo implements Command {
	private Stereo stereo;

	public CommandTurnOffStereo(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.turnOffStereo();

	}

	public void undo() {
		stereo.turnOnStereo();
	}

}
