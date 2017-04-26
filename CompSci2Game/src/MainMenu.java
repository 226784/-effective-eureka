/**
 * Created by 226784 on 4/7/2017.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.*;

//http://www.java2s.com/Code/Java/Swing-JFC/Createamainmenu.htm
//http://stackoverflow.com/questions/1234912/how-to-programmatically-close-a-jframe
//https://docs.oracle.com/javase/tutorial/uiswing/components/button.html
//http://stackoverflow.com/questions/20799131/how-can-i-check-that-jbutton-is-pressed-if-the-isenable-is-not-work#comment31181921_20799131

public class MainMenu implements ActionListener {

    MainMenu() {


        JFrame menu = new JFrame("Menu");
        menu.setSize(1920,1080);


        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton button1 = new JButton("TEST");



        menu.add(button1);

        if (button1.getModel().isPressed()){
           System.out.print("button is pressed");

        }



        menu.setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {



    }


}
