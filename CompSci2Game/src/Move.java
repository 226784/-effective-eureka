/**
 * Created by 226784 on 1/31/2017.
 */

//import java.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.geom.*;



//http://valk.id.au/blog/awesome/how-to-run-java-applets-in-intellij-idea/

/**
 * Created by 226784 on 1/27/2017.
 */

//LOOK INTO BUFFERED IMAGES TO CALL IMAGE IN PAINT COMPONENT
//
//
//
//
//
//
//


public class Move extends JFrame {


    private JLabel item1;
    private JLabel imageJLabel;
    //


    public Move() {
        super("KEEEP THE BALLOON UUPPPPP");
        setLayout(new FlowLayout());

        item1 = new JLabel("TESTTTTTTT");
        item1.setToolTipText("this is a major teest");
        add(item1);


        ImageIcon image = new ImageIcon("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\head.png");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(10, 10, 400, 400);
        imageLabel.setVisible(true);

      // add(imageLabel);
        //HEAD^

         class actions  extends Move implements ActionListener, KeyListener{

            Timer t = new Timer(5,this);
            double x=0,y=0, velx=0, vely=0;

            public actions(){
                t.start();
                addKeyListener(this);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
            }

            public void paintComponent(Graphics g){
                paintComponent(g);
              // g.drawImage(imageLabel,30,30,this);


            }
            public void actionPerformed(ActionEvent e){
                if (x < 0 || x > 760){
                    velx = -velx;
                }
                if (y < 0 || y > 560){
                    vely = -vely;
                }
                repaint();
                x += velx;
                y += vely;
            }
            public void up(){
                vely = -2;
                velx = 0;
            }
            public void down(){
                vely = 2;
                velx = 0;
            }
            public void left(){
                velx = -2;
                vely = 0;
            }
            public void right(){
                velx = 2;
                vely = 0;
            }

            public void keyPressed(KeyEvent e){
                int code = e.getKeyCode();

                if(code == KeyEvent.VK_UP){
                    up();
                }
                if(code == KeyEvent.VK_DOWN){
                    down();
                }
                if(code == KeyEvent.VK_RIGHT){
                    right();
                }
                if(code == KeyEvent.VK_LEFT){
                    left();
                }
            }
            public void keyTyped(KeyEvent e) {}
            public void keyReleased(KeyEvent e) {}

        }






    }
}