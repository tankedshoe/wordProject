package word.controller;

import java.util.*;
import word.view.*;
import word.model.*;

public class Controller
{
	private List<Font> fontList;
	private List<Word> words;
	private WordFrame appFrame;
	//DATA MEMBERS (all private)
	
	//CONSTRUCTORS
	public Controller()
	{
		this.fontList = new ArrayList<Font>();
		this.appFrame = new WordFrame(this);
		
		buildFontList();
	}
	
	//METHODS
	public void start()
	{
		
	}
	
	public void buildFontList()
	{
		fontList.add(new Font("Times New Roman"));
		fontList.add(new Font("Helvatica"));
		fontList.add(new Font("Arial"));
		fontList.add(new Font("Courier"));
		fontList.add(new Font("Verdana"));
	}
	
}
