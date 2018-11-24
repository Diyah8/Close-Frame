/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closeframe;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author USER
 */
public class CloseFrame extends Frame implements WindowListener{
    
    Label label;
    
    public CloseFrame(String title){
        super(title);
        label = new Label("Close the Frame");
        this.addWindowListener(this);
    }
    public void launchFrame(){
        setSize(300, 300);
        setVisible(true);
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CloseFrame cf = new CloseFrame("Close Window Example");
        cf.launchFrame();
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
       setVisible(false);
       System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

   
   

}