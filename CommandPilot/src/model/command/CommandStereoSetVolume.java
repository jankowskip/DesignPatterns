package model.command;

import model.Stereo;

public class CommandStereoSetVolume implements Command {
	private Stereo stereo;

	public CommandStereoSetVolume(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.setVolume(0); 

	}

	public void undo() {
		stereo.setVolume(0);
	}

}
