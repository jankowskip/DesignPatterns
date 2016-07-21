package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorController {
	CalculatorView view;
	CalculatorModel model;

	public CalculatorController(CalculatorView view, CalculatorModel model) {
		this.view = view;
		this.model = model;
		this.view.addCalculateListener(new CalculateListener());
	}

	public class CalculateListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				double firstNumber = view.getFirsNumber();
				double secondNumber = view.getSecondNumber();
				if (!view.getDivideMultiplyFlag()) {
					view.setCalculatedValue(String.valueOf(model.divide(firstNumber, secondNumber)));
				} else {
					view.setCalculatedValue(String.valueOf(model.multiply(firstNumber, secondNumber)));
				}
			} catch (NumberFormatException ex ) {
				ex.printStackTrace();
			}

		}

	}

}
