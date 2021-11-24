package view;

import javax.swing.*;

import model.FeetConversionArea;
import model.MeterConversionArea;
import model.CentimetersConversionArea;
import model.ValueToConvert;

import java.awt.*;
import java.util.ArrayList;


public class ConverterPanel extends JPanel {
    private final Font uiFont;

    private FeetConversionArea feetArea;
    private MeterConversionArea meterArea;
    private CentimetersConversionArea centiMeterArea;
    private JPanel panel;
    private ValueToConvert valueToConvert;

    public ConverterPanel() {
        panel = new JPanel();
        uiFont = new Font("UI", Font.BOLD, 15);
        valueToConvert = new ValueToConvert();
        centiMeterArea = new CentimetersConversionArea(150, 240, 15, 25, valueToConvert);
        feetArea = new FeetConversionArea(50, 0, 15, 25, valueToConvert);
        meterArea = new MeterConversionArea(290, 0, 15, 25, valueToConvert);
        panel.add(feetArea.getTextArea());
        panel.add(meterArea.getTextArea());
        panel.add(centiMeterArea.getTextArea());
        setupRepaint();
    }

    private void setupRepaint() {
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public JPanel getConverterPanel() {
        return this.panel;
    }

    public FeetConversionArea getFeetConversionArea() {
        return this.feetArea;
    }

    public MeterConversionArea getMeterConversionArea() {
        return this.meterArea;
    }

    public CentimetersConversionArea getCentimetersConversionArea() {
        return this.centiMeterArea;
    }


}
