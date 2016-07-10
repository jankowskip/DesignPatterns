import model.GarageDoors;
import model.Jacuzzi;
import model.Light;
import model.Pilot;
import model.Stereo;
import model.command.Command;
import model.command.CommandCloseGarageDoors;
import model.command.CommandOpenGarageDoors;
import model.command.CommandTurnOffJacuzzi;
import model.command.CommandTurnOffLight;
import model.command.CommandTurnOffStereo;
import model.command.CommandTurnOnJacuzzi;
import model.command.CommandTurnOnLight;
import model.command.CommandTurnOnStereo;
import model.command.MacroCommand;

public class Start {

	public static void main(String[] args) {
		Pilot pilot = new Pilot();
		Light livingRoomLight = new Light();
		Light kitchenLight = new Light();
		GarageDoors garageDoors = new GarageDoors();
		Stereo stereo = new Stereo();
		Jacuzzi jacuzzi = new Jacuzzi();

		CommandTurnOnLight livingRoomTurnOnLight = new CommandTurnOnLight(livingRoomLight);
		CommandTurnOffLight livingRoomTurnOffLight = new CommandTurnOffLight(livingRoomLight);

		CommandTurnOnLight kitcheTurnOnLight = new CommandTurnOnLight(kitchenLight);
		CommandTurnOffLight kitchenTurnOffLight = new CommandTurnOffLight(kitchenLight);

		CommandOpenGarageDoors garageDoorsOpen = new CommandOpenGarageDoors(garageDoors);
		CommandCloseGarageDoors garageDoorsClose = new CommandCloseGarageDoors(garageDoors);

		CommandTurnOnStereo turnOnStereo = new CommandTurnOnStereo(stereo);
		CommandTurnOffStereo turnOffStereo = new CommandTurnOffStereo(stereo);

		CommandTurnOnJacuzzi turnOnJacuzzi = new CommandTurnOnJacuzzi(jacuzzi);
		CommandTurnOffJacuzzi turnOffJacuzzi = new CommandTurnOffJacuzzi(jacuzzi);

		// time for party
		Command[] turnOnParty = { livingRoomTurnOnLight, turnOnStereo, turnOnJacuzzi };
		Command[] turnOffParty = { livingRoomTurnOffLight, turnOffStereo, turnOffJacuzzi };

		MacroCommand macroTurnOnParty = new MacroCommand(turnOnParty);
		MacroCommand macroTurnOffParty = new MacroCommand(turnOffParty);

		pilot.setCommand(0, livingRoomTurnOnLight, livingRoomTurnOffLight);
		pilot.setCommand(1, kitcheTurnOnLight, kitchenTurnOffLight);
		pilot.setCommand(2, garageDoorsOpen, garageDoorsClose);
		pilot.setCommand(3, turnOnStereo, turnOffStereo);
		pilot.setCommand(4, macroTurnOnParty, macroTurnOffParty);

		System.out.println(pilot);

		pilot.buttonOnHasBeenPressed(0);
		pilot.buttonOffHasBeenPressed(0);

		pilot.buttonOnHasBeenPressed(1);
		pilot.buttonOffHasBeenPressed(1);

		pilot.buttonOnHasBeenPressed(2);
		pilot.buttonOffHasBeenPressed(2);

		pilot.buttonOnHasBeenPressed(3);
		pilot.buttonOffHasBeenPressed(3);

		pilot.buttonUndoHasBeenPressed(3);

		pilot.buttonOnHasBeenPressed(4);
		pilot.buttonUndoHasBeenPressed(4);

		System.out.println(pilot);

	}

}
