package model;

import model.command.Command;
import model.command.NoCommand;

public class Pilot {
	private Command[] commandOn;
	private Command[] commandOff;
	private Command commandUndo;

	public Pilot() {
		commandOn = new Command[7];
		commandOff = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i =0; i<commandOn.length; i++){
			commandOn[i] = noCommand;
			commandOff[i] = noCommand;
		}
		commandUndo = noCommand;
	}
	
	public void setCommand(int slot, Command commandOn, Command commandOff){
		this.commandOn[slot] = commandOn;
		this.commandOff[slot] = commandOff;
	}
	
	public void buttonOnHasBeenPressed(int slot){
		commandOn[slot].execute();
		commandUndo = commandOn[slot];
	}
	public void buttonOffHasBeenPressed(int slot){
		commandOff[slot].execute();
		commandUndo = commandOff[slot];
	}
	
	public void buttonUndoHasBeenPressed(int slot){
		commandUndo.undo();
	}
	
	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n---- Pilot ----\n");
		for (int i =0; i < commandOn.length;i++){
			stringBuff.append("[slot " + i + "] " + commandOn[i].getClass().getName() + "     "
					+ commandOff[i].getClass().getName() + "\n");
		}
		stringBuff.append("[Undo]" +  commandUndo.getClass().getName() + "\n");
		return stringBuff.toString();
		
	}
}
