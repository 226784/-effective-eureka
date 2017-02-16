/**
 * Created by 226784 on 1/31/2017.
 */

//import java.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;


//http://valk.id.au/blog/awesome/how-to-run-java-applets-in-intellij-idea/

public class Move extends Applet {

     private Image head = null;

    public void paint(Graphics g) {
        this.setSize(640,480);
        if (head == null)
            head = getImage("head.png");

        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(head, 30,30, 30, 30, this);

    }

    public Image getImage(String path){
        Image tempImage = null;
        try{
            URL imageURL = Move.class.getResource(path);
            tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
        }

        catch(Exception e){
            System.out.println("ERROR" + e.getMessage());
        }
        return tempImage;
    }
}