package AWTCounter;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AWTCounter extends JFrame implements ActionListener {
	private JLabel title, label;
	private JTextField textField;
	private JButton countButton;
	private JPanel panel;
	private int counter;
	
	public AWTCounter() {
		this.setSize(300, 100);
		this.setTitle("AWT Counter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setup();
		
		this.setVisible(true);
	}
	
	private void setup() {
//		JPanel mainPanel = new JPanel();
		JPanel panel = new JPanel(new GridLayout(1,3));
		this.add(panel);
		label = new JLabel("Counter");
		panel.add(label);
		textField = new JTextField();
		panel.add(textField);
		countButton = new JButton("Count");
		countButton.addActionListener(this);
		panel.add(countButton);
//		mainPanel.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.countButton) {
			++this.counter;
			this.textField.setText(Integer.toString(this.counter));
		}
		
	}
	public static void main(String[] args) {
		new AWTCounter();
	}


}
