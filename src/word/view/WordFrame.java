package word.view;

import word.controller.Controller;
import javax.swing.JFrame;

public class WordFrame extends JFrame
{
	private Controller appController;
	private WordPanel appPanel;
	
	public WordFrame(Controller appController)
	{
		super();
		this.appController = appController;
		appPanel = new WordPanel(appController);
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setSize(500, 500);
		this.setTitle("Word Editor");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
