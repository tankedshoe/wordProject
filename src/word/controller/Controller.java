package word.controller;

import java.util.*;
import word.view.*;
import word.model.*;
import java.text.Format;

public class Controller
{
	private List<Font> fontList;
	private List<Word> words;
	private WordFrame appFrame;
	
	private boolean leftAlignStatus;
	private boolean rightAlignStatus;
	private boolean centerAlignStatus;
	private boolean justifiedAlignStatus;
	//DATA MEMBERS (all private)
	
	//CONSTRUCTORS
	public Controller()
	{
		this.fontList = new ArrayList<Font>();
		this.appFrame = new WordFrame(this);
		
		this.leftAlignStatus = false;
		this.rightAlignStatus = false;
		this.centerAlignStatus = false;
		this.justifiedAlignStatus = false;
		
		buildFontList();
	}
	
	//METHODS
	public void start()
	{
		
	}
	
	//ABSTRACTION EXAMPLE
	public void buildFontList()
	{
		fontList.add(new Font("Times New Roman"));
		fontList.add(new Font("Helvatica"));
		fontList.add(new Font("Arial"));
		fontList.add(new Font("Courier"));
		fontList.add(new Font("Verdana"));
	}
	
	public void convert(boolean leftAlign, boolean rightAlign, boolean centerAlign, boolean justifiedAlign, boolean itEm, boolean boEm, int fontSize, String fontType, String input)
	{
		
	}
	
	//GETTERS
	public boolean getLeftAlignStatus()
	{
		return leftAlignStatus;
	}
	
	public boolean getRightAlignStatus()
	{
		return rightAlignStatus;
	}
	
	public boolean getCenterAlignStatus()
	{
		return centerAlignStatus;
	}
	
	public boolean getJustifiedAlignStatus()
	{
		return justifiedAlignStatus;
	}
	
	//SETTERS
	public void leftAlignSetter()
	{
		if (leftAlignStatus = false)
		{
			leftAlignStatus = true;
		}
		else
		{
			leftAlignStatus = false;
		}
	}
	
	public void rightAlignSetter()
	{
		if (rightAlignStatus = false)
		{
			rightAlignStatus = true;
		}
		else
		{
			rightAlignStatus = false;
		}
	}
	
	public void centerAlignSetter()
	{
		if (centerAlignStatus = false)
		{
			centerAlignStatus = true;
		}
		else
		{
			centerAlignStatus = false;
		}
	}
	
	public void justifiedAlignSetter()
	{
		if (justifiedAlignStatus = false)
		{
			justifiedAlignStatus = true;
		}
		else
		{
			justifiedAlignStatus = false;
		}
	}
}
