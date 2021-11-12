package main;

import controller.MenubarListener;
import view.ConverterMenuBar;
import view.ConverterPanel;


import javax.swing.*;

public class ConverterApp {
	public static void main(String[] args) {
		JFrame converterFrame = new JFrame("Converter");
		ConverterPanel converterPanel = new ConverterPanel();
		MenubarListener converterListener = new MenubarListener(converterPanel);
		ConverterMenuBar menuBar = new ConverterMenuBar(converterListener);
		converterFrame.add(converterPanel.getConverterPanel());
	//	converterFrame.addKeyListener(converterListener);
		converterFrame.setJMenuBar(menuBar);
		converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		converterFrame.setSize(600, 600);
		converterFrame.setLocationRelativeTo(null);
		converterFrame.setResizable(false);
		converterFrame.setVisible(true);
	}
}
