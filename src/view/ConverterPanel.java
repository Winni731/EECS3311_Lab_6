package view;

import javax.swing.*;

import model.FeetConversionArea;
import model.MeterConversionArea;
import model.CentimetersConversionArea;
import model.ValueToConvert;

import java.awt.*;
import java.util.ArrayList;

/**
 * This class extends JPanel which represents a ConverterPanel type
 */
public class ConverterPanel extends JPanel {
	/**
	 * The font used for the UI
	 */
    private final Font uiFont;
    /**
     * The conversion area for feet value
     */
    private FeetConversionArea feetArea;
    /**
     * The conversion area for meter value
     */
    private MeterConversionArea meterArea;
    /**
     * The conversion area for centimeter value
     */
    private CentimetersConversionArea centiMeterArea;
    /**
     * The panel contains conversion areas
     */
    private JPanel panel;
    /**
     * The value for conversion
     */
    private ValueToConvert valueToConvert;

    /**
     * This is the default constructor which instantiates a new Converter panel
     * 
     * invariants: valueToConvert value is always non-negative
	 * preconditions: None
	 * postconditions: a new Converter panel with three text areas will be instantiated
     */
    public ConverterPanel() {
        panel = new JPanel();
        uiFont = new Font("UI", Font.BOLD, 15);
        valueToConvert = new ValueToConvert(meterArea, feetArea);
        centiMeterArea = new CentimetersConversionArea(150, 240, 15, 25);	// create centimeter conversion area
        feetArea = new FeetConversionArea(50, 0, 15, 25, valueToConvert);	// create feet conversion area
        meterArea = new MeterConversionArea(290, 0, 15, 25, valueToConvert);	// create meter conversion area
        panel.add(feetArea.getTextArea());	// add feet conversion area to panel
        panel.add(meterArea.getTextArea());	// add meter conversion area to panel
        panel.add(centiMeterArea.getTextArea());	// add centimeter conversion area to panel
        setupRepaint();
    }

    /**
     * This method sets repaint
     * 
     * invariants: None
	 * preconditions: None
	 * postconditions: sets repaint for the panel
     */
    private void setupRepaint() {
        repaint();
    }

    /**
     * This method paints the graph
     * 
     * invariants: None
	 * preconditions: None
	 * postconditions: paints the graph on the panel
	 * 
	 * @param g the Graphics object used to paint
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    /**
     * This is the helper method that gets the Converter panel
     * 
     * invariants: None
	 * preconditions: None
	 * postconditions: gets the converter panel
	 * 
     * @return the current converter panel
     */
    public JPanel getConverterPanel() {
        return this.panel;
    }

    /**
     * This is the helper method that gets the feet conversion area
     * 
     * invariants: None
	 * preconditions: None
	 * postconditions: gets the feet conversion area
     * 
     * @return the current feet conversion area
     */
    public FeetConversionArea getFeetConversionArea() {
        return this.feetArea;
    }

    /**
     * This is the helper method that gets the meter conversion area
     * 
     * invariants: None
	 * preconditions: None
	 * postconditions: gets the meter conversion area
     * 
     * @return the current meter conversion area
     */
    public MeterConversionArea getMeterConversionArea() {
        return this.meterArea;
    }

    /**
     * This is the helper method that gets the centimeter conversion area
     * 
     * invariants: None
	 * preconditions: None
	 * postconditions: gets the centimeter conversion area
     * 
     * @return the current centimeter conversion area
     */
    public CentimetersConversionArea getCentimetersConversionArea() {
        return this.centiMeterArea;
    }

}
