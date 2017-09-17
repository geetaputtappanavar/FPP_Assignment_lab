package fpp.assignments.lesson6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Problem1Screen extends JFrame implements ActionListener{
	static JTextField outText;
	static JTextField inText;
	static JButton countButton;
	static JButton revButton;
	static JButton remDupButton;
	public static void main(String[] args) {
		Problem1Screen obj = new Problem1Screen();
		JFrame frame = new JFrame();
		frame.setTitle("String Utility");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		frame.setLayout(null);
		
		countButton = new JButton("Count Letters");
		countButton.setBounds(30, 30, 150, 25);
		frame.add(countButton);
		obj.callAction(countButton);
		
		revButton = new JButton("Reverse Letters");
		revButton.setBounds(30, 70, 150, 25);
		frame.add(revButton);
		obj.callAction(revButton);
		
		remDupButton = new JButton("Remove Duplicates");
		remDupButton.setBounds(30, 110, 150, 25);
		frame.add(remDupButton);
		obj.callAction(remDupButton);
		
		JLabel inLabel = new JLabel("Input");
		inLabel.setBounds(200, 30, 50, 20);
		frame.add(inLabel);
		
		inText = new JTextField(20);
		inText.setBounds(200, 50, 200, 20);
		frame.add(inText);
		
		JLabel outLabel = new JLabel("Output");
		outLabel.setBounds(200, 70, 50, 20);
		frame.add(outLabel);
		
		frame.setVisible(true);
		
		outText = new JTextField(20);
		outText.setBounds(200, 90, 200, 20);
		frame.add(outText);
	}

	public void callAction(JButton countButton) {
		countButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == countButton){
			outText.setText(new Integer(inText.getText().length()).toString());
		}if(e.getSource() == revButton){
			outText.setText((new StringBuilder(inText.getText()).reverse()).toString());
		}if(e.getSource() == remDupButton){
			outText.setText(remDupChars(inText.getText()));
		}
	}
	
	public String remDupChars(String str){
		if(str.length()<=1){
			return str;
		}
		if(str.substring(1).contains(str.substring(0, 1))){
			return remDupChars(str.substring(1));
		}else{
			return str.substring(0, 1)+remDupChars(str.substring(1));
		}
	}
}
