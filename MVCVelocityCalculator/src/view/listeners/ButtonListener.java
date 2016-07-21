package view.listeners;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JLabel;

import view.CalculatorView;

public abstract class ButtonListener implements ActionListener {
	private List<JLabel> labelList;
	protected CalculatorView calculatorView;

	public ButtonListener(List<JLabel> labelList, CalculatorView calculatorView) {
		this.labelList = labelList;
		this.calculatorView = calculatorView;
	}

	protected void setTextInLabels(String[] stringTable) {
		for (int i = 0; i < labelList.size(); i++) {
			labelList.get(i).setText(stringTable[i]);

		}
	}
}
