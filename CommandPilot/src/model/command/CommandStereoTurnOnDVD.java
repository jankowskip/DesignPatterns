package model.command;

import model.Stereo;

public class CommandStereoTurnOnDVD implements Command {
	private Stereo stereo;

	public CommandStereoTurnOnDVD(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.turnOnStereo();
		stereo.switchToDVD();
		stereo.setVolume(10);

	}

	public void undo() {
		stereo.turnOffStereo();
	}

}
