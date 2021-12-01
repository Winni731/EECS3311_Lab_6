package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        String text = getPanel().getCentimetersConversionArea().getTextArea().getText();
        ValueToConvert valueToConvert = new ValueToConvert();
        

        try {
            System.out.println(text);

            ReadRequest read;
            WriteRequest write;
            Invoker invoker;

            String meter = valueToConvert.cmToMeter(text);
            Request meterRequest = new Request(text, meter + " m");
            read = new ReadRequest(meterRequest);
            invoker = new Invoker(read);
            invoker.clickUpdate();

            String feet = valueToConvert.cmToFeet(text);
            Request feetRequest = new Request(text, feet + " ft");
            read = new ReadRequest(feetRequest);
            invoker = new Invoker(read);
            invoker.clickUpdate();
            
            write = new WriteRequest(meterRequest);
            invoker = new Invoker(write);
            panel.getMeterConversionArea().SetText(meter + " m");
            invoker.clickUpdate();

            write = new WriteRequest(feetRequest);
            invoker = new Invoker(write);
            panel.getFeetConversionArea().SetText(feet + " ft");
            invoker.clickUpdate();

        } catch (NumberFormatException nfe) {
            System.out.println(nfe);
        }
    }

    public ConverterPanel getPanel() {
        return this.panel;
    }

}
