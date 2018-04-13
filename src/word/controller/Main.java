package word.controller;

import word.model.*;
import word.view.*;

public class Main {
    /*
     * @Version: 0.002
     * not much in terms of commenting but a lot of this stuff is very obvious
     */
    public Main(){
        WordFrame mainFrame = new WordFrame();
        DataStuff data = new DataStuff();
        @SuppressWarnings("unused")
        ProcessEvents process = new ProcessEvents(mainFrame, data );
        mainFrame.setVisible(true);
    }

    public static void main(String args[]){
        @SuppressWarnings("unused")
        Main m = new Main();
    }
}