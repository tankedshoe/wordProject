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
	private JButton submit;
	
	private JCheckBox boldEm;
	private JCheckBox italicEm;
	
	private JComboBox fontSize;
	private JComboBox fontType;
	
	private JColorChooser colorChoose;
	
	private SpringLayout layout;
	private Controller appController;
	private JTextField wordDoc;
	private JTextArea wordDocDisplay;
	
	public WordPanel(Controller appController)
	{
		super();
		this.appController = appController;
		this.leftAlign = new JButton("", new ImageIcon(getClass().getResource("/word/view/images/leftAlign.png")));
		this.rightAlign = new JButton("", new ImageIcon(getClass().getResource("/word/view/images/rightAlign.png")));
		this.centerAlign = new JButton("", new ImageIcon(getClass().getResource("/word/view/images/centerAlign.png")));
		this.justifiedAlign = new JButton("", new ImageIcon(getClass().getResource("/word/view/images/justifiedAlign.png")));
		this.submit = new JButton("Submit");
		
		this.boldEm = new JCheckBox("Bold");
		this.italicEm = new JCheckBox("Italicize");
		
		this.fontSize = new JComboBox();
		this.fontType = new JComboBox();
		
		this.layout = new SpringLayout();
		layout.putConstraint(SpringLayout.NORTH, fontType, 0, SpringLayout.NORTH, fontSize);
		layout.putConstraint(SpringLayout.EAST, fontType, -10, SpringLayout.EAST, this);
		
		this.wordDoc = new JTextField(40);
		this.wordDocDisplay = new JTextArea(20, 30);
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupComboBox()
	{
		fontType.addItem("Times New Roman");
		fontType.addItem("Helvetica");
		fontType.addItem("Arial");
		fontType.addItem("Courier");
		fontType.addItem("Verdana");
	}
	
	public void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(new Color(100, 100, 100));
		
		this.add(leftAlign);
		this.add(rightAlign);
		this.add(centerAlign);
		this.add(justifiedAlign);
		this.add(boldEm);
		this.add(italicEm);
		this.add(fontSize);
		this.add(fontType);
		this.add(wordDoc);
		this.add(wordDocDisplay);
		this.add(submit);
	}
	
	public void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, fontSize, 25, SpringLayout.SOUTH, boldEm);
		layout.putConstraint(SpringLayout.NORTH, justifiedAlign, 17, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, justifiedAlign, 6, SpringLayout.EAST, rightAlign);
		layout.putConstraint(SpringLayout.SOUTH, justifiedAlign, -6, SpringLayout.NORTH, italicEm);
		layout.putConstraint(SpringLayout.EAST, justifiedAlign, -117, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, italicEm, 6, SpringLayout.SOUTH, centerAlign);
		layout.putConstraint(SpringLayout.WEST, italicEm, 10, SpringLayout.WEST, justifiedAlign);
		layout.putConstraint(SpringLayout.NORTH, rightAlign, 17, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, rightAlign, -6, SpringLayout.NORTH, boldEm);
		layout.putConstraint(SpringLayout.NORTH, boldEm, 6, SpringLayout.SOUTH, leftAlign);
		layout.putConstraint(SpringLayout.SOUTH, leftAlign, -361, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, leftAlign, 17, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, centerAlign, 0, SpringLayout.NORTH, leftAlign);
		layout.putConstraint(SpringLayout.WEST, centerAlign, 6, SpringLayout.EAST, justifiedAlign);
		layout.putConstraint(SpringLayout.SOUTH, centerAlign, -361, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, centerAlign, -47, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, leftAlign, -243, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, rightAlign, 6, SpringLayout.EAST, leftAlign);
		layout.putConstraint(SpringLayout.EAST, rightAlign, -180, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, wordDoc, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, wordDoc, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, fontSize, 59, SpringLayout.EAST, wordDocDisplay);
		layout.putConstraint(SpringLayout.WEST, boldEm, 49, SpringLayout.EAST, wordDocDisplay);
		layout.putConstraint(SpringLayout.WEST, leftAlign, 16, SpringLayout.EAST, wordDocDisplay);
		layout.putConstraint(SpringLayout.NORTH, wordDocDisplay, 17, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, wordDocDisplay, 10, SpringLayout.WEST, this);
	}
	
	public void setupListeners()
	{
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)
			{
				appController.convert(appController.getLeftAlignStatus(), appController.getRightAlignStatus(), appController.getCenterAlignStatus(), appController.getJustifiedAlignStatus());
			}
		});
		leftAlign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)
			{
				appController.leftAlignSetter();
				
			}
		});
		rightAlign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)
			{
				appController.rightAlignSetter();
				
			}
		});
		centerAlign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)
			{
				appController.centerAlignSetter();
				
			}
		});
		justifiedAlign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)
			{
				appController.justifiedAlignSetter();
				
			}
		});
	}
	
}
