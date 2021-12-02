package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * This class extends JMenuBar which represents the type Converter menu bar
 */
public class ConverterMenuBar extends JMenuBar {
	/** 
	 * This is the constructor which instantiates a new Converter menu bar.
	 * 
	 * invariants: None
	 * preconditions: None
	 * postconditions: instantiate a new Converter menu bar
	 * 
	 * @param menubarListener the menu bar listener
	 */
	public ConverterMenuBar(ActionListener menubarListener) {
		super();	// calling super class constructor
		JMenu ConverterMenu = new JMenu("Update model");	// instantiates a new Update model menu
		ConverterMenu.add(createMenuItem("Save input centimeters", "Update", KeyEvent.VK_F, menubarListener));	// add save input option to the menu		
		super.add(ConverterMenu);	// add Converter menu to the JMenubar
	}
	
	/**
	 * This method creates JMenu Items which contains text, action command, accelerator and action listener.
	 * 
	 * invariants: None
	 * preconditions: None
	 * postconditions: a JMenuItem which contains text, action command, accelerator and action listener is created
	 * 
	 * @param text the text to add to menu
	 * @param actionCommand the action to be done for given item
	 * @param accelerator hot key for provided item
	 * @param listener activating condition for provided item
	 * @return JMenuItem with provided parameters
	 */
	private JMenuItem createMenuItem(String text, String actionCommand, int accelerator, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);	// instantiate a new text menu item
		menuItem.setActionCommand(actionCommand);	// set the action command of menu item to actionCommand
		menuItem.addActionListener(listener);	// add listener to the menu item
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, KeyEvent.ALT_DOWN_MASK));	// ALT-F key combination as accelerator
		return menuItem;
	}

}
