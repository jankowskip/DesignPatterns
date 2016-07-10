package model.command;

import model.Stereo;

public class CommandStereoTurnOnRadio implements Command {
	private Stereo stereo;

	public CommandStereoTurnOnRadio(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.turnOnStereo();
		stereo.switchToRadio();
		stereo.setVolume(10);

	}

	public void undo() {
		stereo.turnOffStereo();
	}

}
