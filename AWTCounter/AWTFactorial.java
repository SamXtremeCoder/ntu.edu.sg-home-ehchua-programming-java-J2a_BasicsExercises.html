package AWTCounter;


	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;


import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
import javax.swing.SwingConstants;

	public class AWTFactorial extends JFrame implements ActionListener {
		private JLabel title, label, factorialLabel;
		private JTextField textField, factorialTextField;
		private JButton nextButton;
		private JPanel panel;
		private int counter = 0;
		private int factorial;
		
		public AWTFactorial() {
			this.setSize(500, 75);
			this.setTitle("AWT Factorial");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setup();
			
			this.setVisible(true);
		}
		
		private void setup() {
			
			JPanel panel = new JPanel(new GridLayout(1,5));
			this.add(panel);
			factorialLabel = new JLabel("n", SwingConstants.CENTER);
			panel.add(factorialLabel);
			factorialTextField = new JTextField();
			factorialTextField.setEditable(false);
			panel.add(factorialTextField);
			label = new JLabel("factorial(n)", SwingConstants.CENTER);
			panel.add(label);
			textField = new JTextField();
			textField.setEditable(false);
			panel.add(textField);
			nextButton = new JButton("Next");
			nextButton.addActionListener(this);
			panel.add(nextButton);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == this.nextButton) {
				++this.counter;
				this.factorial = this.counter;
				this.factorialTextField.setText(Integer.toString(this.counter));
				this.textField.setText(Integer.toString(factorial(this.factorial)));
			}
			
		}
		private int factorial(int counter) {
			if (counter == 0 ) {
				return 1;
			} else {
				return counter * factorial(counter-1);
			}
		}

		public static void main(String[] args) {
			new AWTFactorial();
		}
	}
