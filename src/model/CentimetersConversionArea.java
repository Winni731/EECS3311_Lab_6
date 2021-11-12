package model;

import javax.swing.*;
import java.awt.Color;

public class CentimetersConversionArea {
	
	private static final Color YL = Color.yellow;
//	private static final int ROWS = 240;
//	private static final int COLS = 240;
	private JTextArea textArea;
	
	public CentimetersConversionArea(int upperX, int upperY, int rows, int cols) {
		textArea = new JTextArea("0", rows, cols);
		textArea.setBounds(upperX, upperY, rows, cols);
		textArea.setBackground(Color.yellow);	
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

}
