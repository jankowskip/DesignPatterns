package model.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Null");

	}

	@Override
	public void undo() {

	}

}
