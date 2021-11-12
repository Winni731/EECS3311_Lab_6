package model;

import javax.swing.*;
import java.awt.Color;
import javax.swing.JTextArea;

/** ConcreteObserver class that receives the updates from observable class with observer pattern*/
public class FeetConversionArea implements InterfaceObserver {
	private static final Color GR = Color.green;
//	private static final int ROWS = 240;
//	private static final int COLS = 240;
	private JTextArea textArea;
	
	public FeetConversionArea(int upperX, int upperY, int rows, int cols) {
		textArea = new JTextArea("0 ft", rows, cols);
		textArea.setBounds(upperX, upperY, rows, cols);
		textArea.setBackground(Color.green);	
		textArea.setEditable(false);
		textArea.setSize(240, 240);
	}
	
	public JTextArea getTextArea() {
		return this.textArea;
	}
	
	public String getText() {
		return textArea.getSelectedText();
	}
	
	public void SetText(String text) {
		textArea.setText(text);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
