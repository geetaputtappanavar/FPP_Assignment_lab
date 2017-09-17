package fpp.assignments.lesson6;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Problem2Rainbow extends JFrame implements ActionListener{
	JButton red;
	JButton orange;
	JButton green;
	JButton blue;
	JButton yellow;
	JButton indigo;
	JButton violet;
	public Problem2Rainbow() {
		setTitle("Rainbow Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(580, 180);
		setLayout(new FlowLayout(FlowLayout.LEFT));
	}
	public static void main(String[] args) {
		Problem2Rainbow obj = new Problem2Rainbow();
		
		obj.red = new JButton(); 
		obj.red.setBackground(Color.RED);
		obj.red.setPreferredSize(new Dimension(60, 60));
		obj.add(obj.red);
		obj.callAction(obj.red);
		
		obj.orange = new JButton(); 
		obj.orange.setBackground(Color.orange);
		obj.orange.setPreferredSize(new Dimension(60, 60));
		obj.add(obj.orange);
		obj.callAction(obj.orange);
		
		obj.green = new JButton(); 
		obj.green.setBackground(Color.green);
		obj.green.setPreferredSize(new Dimension(60, 60));
		obj.add(obj.green);
		obj.callAction(obj.green);
		
		obj.blue = new JButton(); 
		obj.blue.setBackground(Color.blue);
		obj.blue.setPreferredSize(new Dimension(60, 60));
		obj.add(obj.blue);
		obj.callAction(obj.blue);
		
		obj.yellow = new JButton(); 
		obj.yellow.setBackground(Color.yellow);
		obj.yellow.setPreferredSize(new Dimension(60, 60));
		obj.add(obj.yellow);
		obj.callAction(obj.yellow);
				
		obj.indigo = new JButton(); 
		final Color indigo = new Color(75, 0, 130);
		obj.indigo.setBackground(indigo);
		obj.indigo.setPreferredSize(new Dimension(60, 60));
		obj.add(obj.indigo);
		obj.callAction(obj.indigo);
		
		obj.violet = new JButton(); 
		final Color violet = new Color(138,43,226);
		obj.violet.setBackground(violet);
		obj.violet.setPreferredSize(new Dimension(60, 60));
		obj.add(obj.violet);
		obj.callAction(obj.violet);
		
		obj.setVisible(true);
	}
	
	public void callAction(JButton actionButton){
		actionButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame popupFrame = new JFrame("Color Meaning");
		//popupFrame.setBounds(MAXIMIZED_BOTH, ALLBITS, 80, 40);
		if(e.getSource() == red){
			JOptionPane.showMessageDialog((Component) e.getSource(), "Red\r\n" + "signifies passion, vitality, enthusiasm and security\r\n" + "", "Color meaning", JOptionPane.DEFAULT_OPTION);
		}
		if(e.getSource() == orange){
			JOptionPane.showMessageDialog((Component) e.getSource(), "Orange\r\n" + "is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control\r\n" + "", "Color meaning", JOptionPane.DEFAULT_OPTION);
		}
		if(e.getSource() == green){
			JOptionPane.showMessageDialog((Component) e.getSource(), "Green\r\n" + "denotes fertility, growth, balance, health and wealth.\r\n" + "", "Color meaning", JOptionPane.DEFAULT_OPTION);
		}
		if(e.getSource() == blue){
			JOptionPane.showMessageDialog((Component) e.getSource(), "Blue\r\n" + "has been associated with Spirituality and Divinity.\r\n" + "", "Color meaning", JOptionPane.DEFAULT_OPTION);
		}
		if(e.getSource() == yellow){
			JOptionPane.showMessageDialog((Component) e.getSource(), "Yellow\r\n" + "represents clarity of thought, wisdom, orderliness and energy.\r\n" + "", "Color meaning", JOptionPane.DEFAULT_OPTION);
		}
		if(e.getSource() == indigo){
			JOptionPane.showMessageDialog((Component) e.getSource(), "Indigo\r\n" + "bridges the Gap between Finite and Infinite.\r\n" + "", "Color meaning", JOptionPane.DEFAULT_OPTION);
		}
		if(e.getSource() == violet){
			JOptionPane.showMessageDialog((Component) e.getSource(), "Violet\r\n" + " is royal color signifying nobility.\r\n" + "", "Color meaning", JOptionPane.DEFAULT_OPTION);
		}
		
	}
}
