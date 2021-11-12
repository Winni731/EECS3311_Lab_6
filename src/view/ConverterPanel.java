package view;

import javax.swing.*;

import model.FeetConversionArea;
import model.MeterConversionArea;
import model.CentimetersConversionArea;

import java.awt.*;
import java.util.ArrayList;


public class ConverterPanel extends JPanel {
	private final Font uiFont;

	private FeetConversionArea feetArea;
	private MeterConversionArea meterArea;
	private CentimetersConversionArea centiMeterArea;
	private JPanel panel;
	
	public ConverterPanel() {
			//super(null);
			panel = new JPanel();
		//	super.setBackground(new Color(255, 255, 255));
			uiFont = new Font("UI", Font.BOLD, 15);
//			setupFeetArea();
//			setupMeterArea();
//			setupCentiMeterArea();
			centiMeterArea = new CentimetersConversionArea(150, 240, 15, 25);
			feetArea = new FeetConversionArea(50, 0, 15, 25);
			meterArea = new MeterConversionArea(290, 0, 15, 25);
			panel.add(feetArea.getTextArea());
			panel.add(meterArea.getTextArea());
			panel.add(centiMeterArea.getTextArea());
//			panel.add(feetArea.getTextArea());
			setupRepaint();	
		}

		public void setupFeetArea() {
			feetArea = new FeetConversionArea(50, 0, 240, 240);
		}
		
		public void setupMeterArea() {
			meterArea = new MeterConversionArea(290, 0, 240, 240);
		}
		
		public void setupCentiMeterArea() {
			centiMeterArea = new CentimetersConversionArea(150, 240, 240, 240);
		}
		
		private void setupRepaint() {
			repaint();
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
//			paintFeetArea(g);
//			paintMeterArea(g);
//			paintCentimetersArea(g);
		}
		
		private void paintCentimetersArea(Graphics g) {
			g.fillRect(150, 240, 240, 240);
				g.setColor(Color.yellow);
				g.setFont(uiFont);
//				g.drawString("Paused", 270, 300);
		}
		
		private void paintFeetArea(Graphics g) {
			g.fillRect(50, 0, 240, 240);
				g.setColor(Color.green);
				g.setFont(uiFont);
//				g.drawString("Paused", 270, 300);
		}
		
		private void paintMeterArea(Graphics g) {
			g.fillRect(290, 0, 240, 240);
				g.setColor(Color.orange);
				g.setFont(uiFont);
//				g.drawString("Paused", 270, 300);
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
