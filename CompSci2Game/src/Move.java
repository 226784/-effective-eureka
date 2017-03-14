/**
 * Created by 226784 on 1/31/2017.
 */


import kotlin.reflect.jvm.internal.impl.descriptors.EffectiveVisibility;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.geom.*;
import java.security.Key;


//http://valk.id.au/blog/awesome/how-to-run-java-applets-in-intellij-idea/

/**
 * Created by 226784 on 1/27/2017.
 */


public class Move extends JPanel implements ActionListener, KeyListener {

        private Image image;
        private Image background  = new ImageIcon("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\background.png").getImage();
        private Image hand = new ImageIcon ("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\hand.png").getImage();
        private Image balloon =  new ImageIcon ("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\balloon.png").getImage();

            Timer t = new Timer(5,this);
            int x=0,y=0, velx=0, vely=0;

            int ballx=500,bally=0,ballvx =0,ballvy=0;


            public Move(){
                image = new ImageIcon("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\head.png").getImage();
                t.start();
                addKeyListener(this);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
            }



            public void paintComponent(Graphics g){

                    super.paintComponent(g);

                    g.drawImage(background,0,0,this);
                    g.drawImage(hand, x, y, this);
                    g.drawImage(balloon,ballx,bally,this);



            }




            public void actionPerformed(ActionEvent e){



                //if(x==(ballx) && y == (bally) || x == ballx && y <=(bally+50 )
                    ballvy = 1;

                if (x < 0 || x > 1920){
                    velx = -velx;
                }
                if (y < 0 || y >1080){
                    vely = -vely;
                }
                repaint();
                x += velx;
                y += vely;
                bally += ballvy;
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

