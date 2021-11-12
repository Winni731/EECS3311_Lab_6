package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ConverterMenuBar extends JMenuBar {
	
	public ConverterMenuBar(ActionListener menubarListener) {
		super();
		JMenu ConverterMenu = new JMenu("Update model");
		ConverterMenu.add(createMenuItem("Save input centimeters", "Update", KeyEvent.VK_F, menubarListener));		
		super.add(ConverterMenu);
	}
	
	private JMenuItem createMenuItem(String text, String actionCommand, int accelerator, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		menuItem.setActionCommand(actionCommand);
		menuItem.addActionListener(listener);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, KeyEvent.ALT_DOWN_MASK));	// ALT-F key combination as accelerator
		return menuItem;
	}

}
