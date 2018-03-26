package word.model;

import java.text.*;
import java.util.*;

public class StringAlignUtils extends Format
{
	private static final long serialVersionUID = 1L;
	
	public enum Alignment 
	{
		LEFT, CENTER, RIGHT,
	}
	
	private Alignment currentAlignment;
	
	private int maxChars;
	
	public StringAlignUtils(int maxChars, Alignment align)
	{
		switch (align)
		{
		case LEFT:
		case CENTER:
		case RIGHT:
			this.currentAlignment = align;
			break;
		default:
			throw new IllegalArgumentException("invalid justification arg.");
		}
		if (maxChars < 0)
		{
			throw new IllegalArgumentException("maxChars must be positive");
		}
		this.maxChars = maxChars;
	}
	
	public StringBuffer format(Object input, StringBuffer where, FieldPosition ignore)
	{
		String s = input.toString();
		List<String> strings = splitInputString(s);
		ListIterator<String> listItr = strings.listIterator();
		
		while (listItr.hasNext())
		{
			String wanted = listItr.next();
			
			switch (currentAlignment)
			{
				case RIGHT:
					pad(where, maxChars - wanted.length());
					where.append(wanted);
					break;
				case CENTER:
					int toAdd = maxChars - wanted.length();
					pad(where, toAdd / 2);
					where.append(wanted);
					pad(where, toAdd - toAdd / 2);
					break;
				case LEFT:
					where.append(wanted);
			}
		}
	}
}