package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FeetConversionArea;
import model.MeterConversionArea;

import model.ValueToConvert;
import view.ConverterPanel;

public class MenubarListener implements ActionListener {
    //	private FeetConversionArea feetArea;
//	private MeterConversionArea meterArea;
    private final ConverterPanel panel;

    public MenubarListener(ConverterPanel converterPanel) {
        // TODO Auto-generated constructor stub
        this.panel = converterPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //panel = new ConverterPanel();

//        if (e.getActionCommand() != null) {
        String text = getPanel().getCentimetersConversionArea().getTextArea().getText();
        ValueToConvert valueToConvert = new ValueToConvert();

        try {
            System.out.println(text);
//            double data = Double.parseDouble(text);
            String meter = valueToConvert.cmToMeter(text);
            String feet = valueToConvert.cmToFeet(text);
            panel.getMeterConversionArea().SetText(meter + " m");
            panel.getFeetConversionArea().SetText(feet + " ft");
        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }
    }

    public ConverterPanel getPanel() {
        return this.panel;
    }

}
