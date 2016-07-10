package model.command;

import model.Stereo;

public class CommandStereoTurnOnCD implements Command {
	private Stereo stereo;

	public CommandStereoTurnOnCD(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.turnOnStereo();
		stereo.switchToCD();
		stereo.setVolume(10);

	}

	public void undo() {
		stereo.turnOffStereo();
	}

}
