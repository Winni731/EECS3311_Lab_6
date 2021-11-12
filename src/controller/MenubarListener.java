package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.FeetConversionArea;
import model.MeterConversionArea;

import view.ConverterPanel;

public class MenubarListener implements ActionListener {
//	private FeetConversionArea feetArea;
//	private MeterConversionArea meterArea;
	private ConverterPanel panel;

	public MenubarListener(ConverterPanel converterPanel) {
		// TODO Auto-generated constructor stub
		this.panel = converterPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//panel = new ConverterPanel();
		
		if (e.getActionCommand() != null) {
			String text = getPanel().getCentimetersConversionArea().getTextArea().getText();
			if ( text == null ) { // need to throw exception here: NumberFormatException
				System.out.println("text is null");
			}
			else {
			System.out.println(text);
			double data = Double.parseDouble(text);
			String meter = Double.toString(data/100);
			String feet = Double.toString(data/30.48);
			panel.getMeterConversionArea().SetText(meter+" m");
			panel.getFeetConversionArea().SetText(feet+ " ft");
			}
		}
		
	}
	
	public ConverterPanel getPanel() {
		return this.panel;
	}

}
