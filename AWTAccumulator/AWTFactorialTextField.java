package AWTAccumulator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AWTFactorialTextField extends JFrame implements ActionListener {
	private JLabel enterLabel, accumulatorSum;
	private JTextField enterTField ;
	private int factorial = 0;

	
	public AWTFactorialTextField() {
		this.setLayout(new FlowLayout());
		this.setSize(500, 100);
		this.setTitle("AWT Accumulator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setup();
		this.setVisible(true);
	}
	
	public void setup() {
		
		JPanel panel = new JPanel(new GridLayout(1,2));
//		JPanel panel = new JPanel(new FlowLayout());
		enterLabel = new JLabel("Enter a positive integer ", SwingConstants.CENTER);
		panel.add(enterLabel);
		enterTField = new JTextField();
		enterTField.setSize(50, 50);
//		enterTField.setHorizontalAlignment(JTextField.CENTER);
		enterTField.addActionListener(this);
		panel.add(enterTField);

		JPanel panel2 = new JPanel();
//		accumulatorLabel = new JLabel("Accumulated sum is \t", SwingConstants.CENTER);
//		panel2.add(accumulatorLabel);
		accumulatorSum = new JLabel("The factorial is  ", SwingConstants.CENTER);

		panel2.add(accumulatorSum);
		
		JPanel mainPanel = new JPanel(new GridLayout(2,2));
		mainPanel.add(panel);
		mainPanel.add(panel2);
		this.add(mainPanel);
	}
	private int factorial(int counter) {
		if (counter == 0 ) {
			return 1;
		} else {
			return counter * factorial(counter-1);
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.enterTField) {
			String enterednum = enterTField.getText();
			this.factorial = Integer.parseInt(enterednum);
			accumulatorSum.setText("The factorial is " + factorial(this.factorial)); 
//			this.accumulatorTField.setText(Integer.toString(this.sum));
			enterTField.setText("");
		}
		
	}
	
	public static void main (String[] args) {
		new  AWTFactorialTextField();
	}
}