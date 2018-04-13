package word.view;

import java.awt.Font;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class WordFrame extends JFrame{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JMenuBar menubar;
    private JMenu fileMenu, editMenu, viewMenu;
    public JMenuItem saveMenuItem, openMenuItem, newMenuItem, exitMenuItem, FontMenuItem;
    public JTextArea textArea = new JTextArea(1000,900);
    private int width = 1280, height = 980;
    private JScrollPane scrollbar = new JScrollPane(textArea);
    public JFileChooser fileChooser = new JFileChooser();
    private int textHeight = 12;
    private Font yeah = new Font(Font.SANS_SERIF, 2, textHeight);

    public WordFrame(){
        setUI();
        addMenuBar();   
        textArea.setFont(yeah);
    }

    public void setUI(){
        this.setTitle("Word Processor");
        this.setIconImage(new ImageIcon(this.getClass().getResource("Bridge.jpg")).getImage());
        this.setSize(width, height);
        this.setLocation(0,0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(scrollbar);

    }

    public void addMenuBar(){
        menubar = new JMenuBar();
        fileMenu = new JMenu(" File ");
        editMenu = new JMenu("Edit ");
        viewMenu = new JMenu("View ");

        newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);
        fileMenu.addSeparator();
        fileMenu.setMnemonic('f');

        openMenuItem = new JMenuItem("Open");

        fileMenu.add(openMenuItem);

        saveMenuItem = new JMenuItem("Save");
        fileMenu.add(saveMenuItem);

        fileMenu.addSeparator();
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);

        FontMenuItem = new JMenuItem("Font");
        editMenu.add(FontMenuItem);
        menubar.add(fileMenu);
        menubar.add(editMenu);
        menubar.add(viewMenu);      

        this.setJMenuBar(menubar);
    }

    public void setFontSize(int i){
        this.textHeight = i;
    }
    public void addListener(ActionListener listener){
        openMenuItem.addActionListener(listener);
        exitMenuItem.addActionListener(listener);
        saveMenuItem.addActionListener(listener);
    }
}
