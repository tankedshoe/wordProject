package word.view;

import javax.swing.*;
import word.controller.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WordPanel
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
		this.leftAlign = new JButton();
		this.rightAlign = new JButton();
		this.centerAlign = new JButton();
		this.justifiedAlign = new JButton();
		
		this.boldEm = new JButton();
		this.italicEm = new JButton();
		
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
		
		this.setBackgroundColor(Color.WHITE);
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}
