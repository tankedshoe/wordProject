package word.view;

import javax.swing.*;
import word.controller.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WordPanel extends JPanel
{
	private JButton leftAlign;
	private JButton rightAlign;
	private JButton centerAlign;
	private JButton justifiedAlign;
	
	private JButton boldEm;
	private JButton italicEm;
	
	private JComboBox fontSize;
	private JComboBox fontType;
	
	private JColorChooser colorChoose;
	
	private SpringLayout layout;
	
	public WordPanel(Controller appController)
	{
		this.leftAlign = new JButton("Left Alignment");
		this.rightAlign = new JButton("Right Alignment");
		this.centerAlign = new JButton("Center Alignment");
		this.justifiedAlign = new JButton("Justified Alignment");
		
		this.boldEm = new JButton("Bold");
		this.italicEm = new JButton("Italicize");
		
		this.fontSize = new JComboBox();
		this.fontType = new JComboBox();
		
		this.colorChoose = new JColorChooser();
		
		this.layout = new SpringLayout();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupComboBox()
	{
		
	}
	
	public void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(Color.WHITE);
		
		this.add(leftAlign);
		this.add(rightAlign);
		this.add(centerAlign);
		this.add(justifiedAlign);
		this.add(boldEm);
		this.add(italicEm);
		this.add(fontSize);
		this.add(fontType);
		this.add(colorChoose);
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}
