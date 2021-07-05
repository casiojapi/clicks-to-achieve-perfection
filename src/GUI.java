import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	private int count = 1;
	private int power = 1;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		frame = new JFrame();

		JButton button = new JButton("click");
		button.addActionListener(this);
		
		label = new JLabel("clicks left to achieve perfection: " + count);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count--;
		label.setText("clicks left to achieve perfection: " + count);
		if (count == 0) {
			count = (int) Math.pow(2, power++) + 1;
			label.setText("almost there...");
		}
		
		
	}

}