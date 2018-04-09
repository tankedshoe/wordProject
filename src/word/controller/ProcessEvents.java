package word.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import word.view.*;
import word.model.*;

public class ProcessEvents
{
	private WordFrame frame = new WordFrame();
	private DataStuff data = new DataStuff();
	private DialogBoxes dialogs = new DialogBoxes();
	private boolean fileSaved;
	String fileName = "";
	int fontSize = 0;
	
	public ProcessEvents(WordFrame frame, DataStuff data)
	{
		this.frame = frame;
		this.data = data;
		this.frame.addComponentListener(new wordProcessListener);
	}
	
	class wordProcessListener implements ActionListener
	{
		@SuppressWarnings("static-access")
		@Override
		
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource().equals(frame.openMenuItem))
			{
				frame.fileChooser.showOpenDialog(frame);
				File f = frame.fileChooser.getSelectedFile();
				
				System.out.println("Command Executed: open");
				
				data.loadFile(f.getAbsoluteFile());
				
				if(data.showText() != null)
				{
					System.out.println(data.showText());
					frame.textArea.append(data.showText().toString());
				}
			}
			
			if (e.getSource().equals(frame.FontMenuItem))
			{
				System.out.println("font");
			}
			
			if (e.getSource().equals(frame.exitMenuItem))
			{
				dialogs.getConfirmDialog("exitWithoutSave");
			}
			
			if (e.getSource().equals(frame.saveMenuItem))
			{
				frame.fileChooser.showSaveDialog(null);
				File f = frame.fileChooser.getSelectedFile();
				String text = frame.textArea.getText();
				data.saveFile(f.getAbsolutePath()+".txt", text);
				System.out.println(f.getName());
				fileSaved = true;
			}
		}
	}
}
