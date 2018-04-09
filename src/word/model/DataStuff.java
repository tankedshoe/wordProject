package word.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStuff
{
	private File file;
	
	String text;
	String name;
	private File saveFile;
	int counter = 0;
	FileInputStream fis = null;
	FileOutputStream fout = null;
	StringBuilder sb = new StringBuilder(4096);
	
	int count = 0;
	public void loadFile(File fileName)
	{
		this.file = fileName;
		try
		{
			fis = new FileInputStream(file);
			
			while ((counter = fis.read()) != -1)
			{
				System.out.print((char) counter);
				
				sb.append((char) counter);
			}

		}
		catch (IOException ex)
		{
			System.out.println("file couldn't be opened, or was incorrect or you clicked cancel");
		}
		finally
		{
			try
			{
				if (fis != null)
				{
					fis.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	public StringBuilder showText()
	{
		return sb;
	}
	
	public void saveFile(String name, String text)
	{
		this.name = name;
		
		try
		{
			fout = new FileOutputStream(name);
			fout.write(text.getBytes());
			System.out.println("file saving worked");
		}
		catch(IOException e)
		{
			System.out.println("File failed to save or something went horribly wrong");
		}
	}
}
