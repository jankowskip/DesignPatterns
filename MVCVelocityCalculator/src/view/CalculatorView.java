package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.listeners.ButtonDistance;
import view.listeners.ButtonTime;
import view.listeners.ButtonVelocity;

public class CalculatorView extends JFrame {
	private JLabel information;
	private JLabel labelFirstNumber;
	private JLabel labelMathSign;
	private JLabel labelSecondNumber;
	private JLabel labelCalculatedValue;
	private JLabel labelMathSign2;
	private List<JLabel> labelList = new ArrayList<JLabel>();
	private JButton calculate;
	private JTextField firstNumber;
	private JTextField secondNumber;
	private JTextField calculatedValue;
	private boolean divideMultiply;  // false - divide, true - multiply

	public CalculatorView() {
		super("Kalkulator");

		JPanel panelOfComponents = new JPanel();
		panelOfComponents.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel panelButtons = new JPanel();
		JPanel panelCalculations = new JPanel();
		JPanel panelCalculate = new JPanel();
		JPanel panelPattern = new JPanel();
		JPanel panelInformation = new JPanel();

		information = new JLabel("Obliczasz predkosc");

		labelFirstNumber = new JLabel(" S ");
		labelMathSign = new JLabel(" / ");
		labelSecondNumber = new JLabel(" T ");
		JLabel labelEqualSign = new JLabel(" = ");
		labelCalculatedValue = new JLabel(" V ");

		firstNumber = new JTextField(5);
		labelMathSign2 = new JLabel(" / ");
		secondNumber = new JTextField(5);
		JLabel equalSign = new JLabel(" = ");
		calculatedValue = new JTextField(5);
		calculatedValue.setEditable(false);

		calculate = new JButton("Oblicz");

		labelList.add(information);
		labelList.add(labelFirstNumber);
		labelList.add(labelMathSign);
		labelList.add(labelSecondNumber);
		labelList.add(labelCalculatedValue);
		labelList.add(labelMathSign2);

		JButton velocityButton = new JButton("Predkosc");
		velocityButton.addActionListener(new ButtonVelocity(labelList, this));
		JButton distanceButton = new JButton("  Droga ");
		distanceButton.addActionListener(new ButtonDistance(labelList, this));
		JButton timeButton = new JButton("  Czas  ");
		timeButton.addActionListener(new ButtonTime(labelList, this));

		panelButtons.add(velocityButton);
		panelButtons.add(distanceButton);
		panelButtons.add(timeButton);

		panelInformation.add(information);

		panelPattern.add(labelFirstNumber);
		panelPattern.add(labelMathSign);
		panelPattern.add(labelSecondNumber);
		panelPattern.add(labelEqualSign);
		panelPattern.add(labelCalculatedValue);

		panelCalculations.add(firstNumber);
		panelCalculations.add(labelMathSign2);
		panelCalculations.add(secondNumber);
		panelCalculations.add(equalSign);
		panelCalculations.add(calculatedValue);

		panelCalculate.add(calculate);

		panelOfComponents.add(panelButtons);
		panelOfComponents.add(panelInformation);
		panelOfComponents.add(panelPattern);
		panelOfComponents.add(panelCalculations);
		panelOfComponents.add(panelCalculate);

		getContentPane().add(BorderLayout.NORTH, panelOfComponents);
		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public double getFirsNumber() {
		return Double.parseDouble(firstNumber.getText());
	}

	public double getSecondNumber() {
		return Double.parseDouble(secondNumber.getText());
	}

	public void setCalculatedValue(String s) {
		calculatedValue.setText(s);
	}

	public void addCalculateListener(ActionListener calculateListener) {
		calculate.addActionListener(calculateListener);
	}

	public String getVariableName() {
		return labelCalculatedValue.getText();
	}

	public boolean getDivideMultiplyFlag() {
		return divideMultiply;
	}
	
	public void setDivideMultiplyFlag(boolean divideMultiply){
		this.divideMultiply = divideMultiply;
	}

}
