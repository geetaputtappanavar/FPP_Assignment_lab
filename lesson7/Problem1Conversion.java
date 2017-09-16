package mum.lesson7;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Problem1Conversion extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Metric Conversion Assistant");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel mileLabel = new JLabel("Mile");
		mileLabel.setBounds(20, 20, 60, 20);
		frame.add(mileLabel);
		JLabel poundLabel = new JLabel("Pound");
		poundLabel.setBounds(20, 50, 60, 20);
		frame.add(poundLabel);
		
		JTextField mileText = new JTextField(20);
		mileText.setBounds(50, 20, 60, 20);
		frame.add(mileText);
		JTextField poundText = new JTextField(20);
		poundText.setBounds(100, 50, 60, 20);
		frame.add(poundText);
		
		/*JLabel gallonLabel = new JLabel("Mile");
		gallonLabel.setBounds(20, 40, 60, 20);
		frame.add(gallonLabel);
		JTextField gallonText = new JTextField(20);
		gallonText.setBounds(50, 60, 60, 20);
		frame.add(gallonText);*/
		
		
		frame.setVisible(true);
	}
}
