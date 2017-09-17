package fpp.assignments.lesson7;

import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Problem1Conversion extends JFrame{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 250);
		frame.setTitle("Metric Conversion Assistant");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel mileLabel = new JLabel("Mile");
		mileLabel.setBounds(20, 20, 80, 20);
		frame.add(mileLabel);
		JLabel poundLabel = new JLabel("Pound");
		poundLabel.setBounds(20, 50, 80, 20);
		frame.add(poundLabel);
		JLabel galLabel = new JLabel("Gallon");
		galLabel.setBounds(20, 80, 80, 20);
		frame.add(galLabel);
		JLabel farLabel = new JLabel("Farenhiiet");
		farLabel.setBounds(20, 110, 80, 20);
		frame.add(farLabel);
		
		JTextField mileText = new JTextField(20);
		mileText.setBounds(100, 20, 100, 20);
		frame.add(mileText);
		JTextField poundText = new JTextField(20);
		poundText.setBounds(100, 50, 100, 20);
		frame.add(poundText);
		JTextField galText = new JTextField(20);
		galText.setBounds(100, 80, 100, 20);
		frame.add(galText);
		JTextField farText = new JTextField(20);
		farText.setBounds(100, 110, 100, 20);
		frame.add(farText);
		/////
		JLabel kmLabel = new JLabel("Kilometer");
		kmLabel.setBounds(250, 20, 80, 20);
		frame.add(kmLabel);
		JLabel kgLabel = new JLabel("Kilogram");
		kgLabel.setBounds(250, 50, 80, 20);
		frame.add(kgLabel);
		JLabel ltrLabel = new JLabel("Liters");
		ltrLabel.setBounds(250, 80, 80, 20);
		frame.add(ltrLabel);
		JLabel cntLabel = new JLabel("Centigrade");
		cntLabel.setBounds(250, 110, 80, 20);
		frame.add(cntLabel);
		
		JTextField kmText = new JTextField(20);
		kmText.setBounds(320, 20, 100, 20);
		frame.add(kmText);
		JTextField kgText = new JTextField(20);
		kgText.setBounds(320, 50, 100, 20);
		frame.add(kgText);
		JTextField ltrText = new JTextField(20);
		ltrText.setBounds(320, 80, 100, 20);
		frame.add(ltrText);
		JTextField cntText = new JTextField(20);
		cntText.setBounds(320, 110, 100, 20);
		frame.add(cntText);
		
		JButton convBtn = new JButton("Convert");
		convBtn.setBounds(190, 160, 80, 30);
		frame.add(convBtn);
		convBtn.addActionListener(
		evt->{
			DecimalFormat df = new DecimalFormat(".######");
			if(!mileText.getText().isEmpty()) {
				
				Double kmDouble =((Double.valueOf(mileText.getText()))*1.60934);
				kmText.setText(df.format(kmDouble).toString());
			}
			if(!poundText.getText().isEmpty()) {	
				Double poundDouble =((Double.valueOf(poundText.getText()))*0.45359237);
				kgText.setText(df.format(poundDouble).toString());
			}
			if(!galText.getText().isEmpty()) {
				Double galDouble =((Double.valueOf(galText.getText()))*3.785412);
				ltrText.setText(df.format(galDouble).toString());	
			}
			if(!farText.getText().isEmpty()) {
				Double farDouble =((Double.valueOf(farText.getText())-32)*5/9);
				/*if(farDouble<0) {
					cntText.setText(new Double(0.0).toString());
				}else {*/
					cntText.setText(df.format(farDouble).toString());
				//}
			}
			
		});
		frame.setVisible(true);
	}
}


