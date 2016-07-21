package view.listeners;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JLabel;

import view.CalculatorView;

public class ButtonTime extends ButtonListener {
	private final String[] stringTable = { "Obliczasz czas", "S", "/", "V", "T", "/" };

	public ButtonTime(List<JLabel> labelList, CalculatorView calculatorView) {
		super(labelList, calculatorView);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		setTextInLabels(stringTable);
		calculatorView.setDivideMultiplyFlag(false);
	}

}
