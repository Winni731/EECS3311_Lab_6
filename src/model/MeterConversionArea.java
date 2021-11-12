package model;

import javax.swing.*;
import java.awt.Color;

/** ConcreteObserver class that receives the updates from observable class with observer pattern*/
public class MeterConversionArea implements InterfaceObserver {	
	private static final Color og = Color.orange;
//	private static final int ROWS = 240;
//	private static final int COLS = 240;
	private JTextArea textArea;
	
	public MeterConversionArea(int upperX, int upperY, int rows, int cols) {
		textArea = new JTextArea("0 m", rows, cols);
		textArea.setBounds(upperX, upperY, rows, cols);
		textArea.setBackground(Color.orange);	
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
