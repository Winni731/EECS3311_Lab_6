package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ValueToConvert;
import view.ConverterPanel;

/**
 * This class primarily manages the action that is taken when the save input centimeters
 * menu option is clicked or is called via the keyboard shortcut
 */
public class MenubarListener implements ActionListener {
    /**
     * The ConverterPanel object 
     */
    private final ConverterPanel panel;

    /**
     * This is the default constructor which initializes the panel object
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the panel object is initialized
     * 
     * @param converterPanel
     */
    public MenubarListener(ConverterPanel converterPanel) {
        this.panel = converterPanel;
    }

    /**
     * This method reads data from the CentimetersConversionArea and writes the converted
     * value to the respective conversion area. During the reading/writing, the requests
     * output their current status on the models conversion status
     * 
     * invariants: none
     * preconditions: the Save input centimeters menu option must be called
     * postconditions: the FeetConversionArea and MeterConversionArea text is updated
     * 
     * @param e the ActionEvent
     * @throws NumberFormatException if the input string is invalid
     */
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

    /**
     * This method returns the ConverterPanel object
     * 
     * invariants: none
     * preconditions: none
     * postconditions: the panel object is returned
     * 
     * @return ConverterPanel object
     */
    public ConverterPanel getPanel() {
        return this.panel;
    }

}
