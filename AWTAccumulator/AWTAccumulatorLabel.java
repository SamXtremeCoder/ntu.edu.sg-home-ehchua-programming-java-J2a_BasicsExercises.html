package AWTAccumulator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AWTAccumulatorLabel extends JFrame implements ActionListener {
	private JLabel enterLabel, accumulatorSum;
	private JTextField enterTField ;
	private int sum = 0;

	
	public AWTAccumulatorLabel() {
		this.setSize(500, 200);
		this.setTitle("AWT Accumulator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setup();
		this.setVisible(true);
	}
	
	public void setup() {
		JPanel panel = new JPanel(new GridLayout(1,2));
		enterLabel = new JLabel("Enter an integer \t", SwingConstants.CENTER);
		panel.add(enterLabel);
		enterTField = new JTextField();
		enterTField.setHorizontalAlignment(JTextField.CENTER);
		enterTField.addActionListener(this);
		panel.add(enterTField);

		JPanel panel2 = new JPanel(new GridLayout(1,2));
//		accumulatorLabel = new JLabel("Accumulated sum is \t", SwingConstants.CENTER);
//		panel2.add(accumulatorLabel);
		accumulatorSum = new JLabel("The accumulated sum is ", SwingConstants.CENTER);

		panel2.add(accumulatorSum);
		
		JPanel mainPanel = new JPanel(new GridLayout(2,0));
		mainPanel.add(panel);
		mainPanel.add(panel2);
		this.add(mainPanel);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.enterTField) {
			String enterednum = enterTField.getText();
			int enternum = Integer.parseInt(enterednum);
			this.sum += enternum;
			accumulatorSum.setText("The accumulated sum is " + this.sum); 
//			this.accumulatorTField.setText(Integer.toString(this.sum));
			enterTField.setText("");
		}
		
	}
	
	public static void main (String[] args) {
		new  AWTAccumulatorLabel();
	}
}
