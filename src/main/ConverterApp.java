package main;

import controller.MenubarListener;
import view.ConverterMenuBar;
import view.ConverterPanel;


import javax.swing.*;

/** This class simulates a ConverterApp that converts a centimeter value to feet value, meter value
 * 	and display them in corresponding views.*/
public class ConverterApp {
	/**
	 * invariants: None
	 * Preconditions: None 
	 * Postconditions: shows a GUI containing three color areas which can convert a centimeter value to 
	 * 					feet and meter values.
	 * @param args command-line arguments that passed to main method.
	 */
    public static void main(String[] args) {
        JFrame converterFrame = new JFrame("Converter");	// create a frame named "Converter"
        ConverterPanel converterPanel = new ConverterPanel();	// create a new converterPanel
        MenubarListener converterListener = new MenubarListener(converterPanel);	// create converterListener on converterPanel
        ConverterMenuBar menuBar = new ConverterMenuBar(converterListener);	// create menuBa with converterListener
        converterFrame.add(converterPanel.getConverterPanel());	// add converterPanel to frame
        converterFrame.setJMenuBar(menuBar);	// set frame menu bar to menuBar
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// set close button
        converterFrame.setSize(620, 560);	// set frame size
        converterFrame.setLocationRelativeTo(null);
        converterFrame.setResizable(false);	// not resizable
        converterFrame.setVisible(true);	
    }
}
