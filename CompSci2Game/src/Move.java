/**
 * Created by 226784 on 1/31/2017.
 */



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
import javax.swing.event.MouseInputListener;
import java.awt.Image;
import java.awt.geom.*;
import java.security.Key;
import java.util.Random;

//MAIN MENU http://www.java2s.com/Code/Java/Swing-JFC/Createamainmenu.htm


//http://valk.id.au/blog/awesome/how-to-run-java-applets-in-intellij-idea/

/**
 * Created by 226784 on 1/27/2017.
 */

//MOUSE MOVEMENT  - http://stackoverflow.com/questions/15329664/java-swing-mousemoved-not-working-at-all
// MOuse movemnt -> http://stackoverflow.com/questions/15329664/java-swing-mousemoved-not-working-at-all
public class Move extends JPanel implements ActionListener, KeyListener,MouseMotionListener {

        private Image image;
        private Image background  = new ImageIcon("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\background.png").getImage();
        private Image hand = new ImageIcon ("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\hand.png").getImage();
        private Image balloon =  new ImageIcon ("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\balloon.png").getImage();

            Timer t = new Timer(5,this);
            int x=0,y=0, velx=0, vely=0;

            int ballx=500,bally=0,ballvy=5;

            int ballvx = 0;

           // Random rand = new Random();
            //int ballvx = rand.nextInt(10) +1;


            public Move(){
                image = new ImageIcon("C:\\Users\\226784\\IdeaProjects\\CompSci2Game\\src\\head.png").getImage();
                t.start();
                addKeyListener(this);
                addMouseMotionListener(this);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
                hideMouse();
            }

            // INVISIBLE CURSOR https://coderanch.com/t/343980/java/mouse-disappear-Java


    private void hideMouse() {
        ImageIcon emptyIcon = new ImageIcon(new byte[0]);
        Cursor invisibleCursor = getToolkit().createCustomCursor(
                emptyIcon.getImage(), new Point(0,0), "Invisible");
        this.setCursor(invisibleCursor);

    }


    public void paintComponent(Graphics g){

                    super.paintComponent(g);

                    g.drawImage(background,0,0,this);
                    g.drawImage(hand, x, y, this);
                    g.drawImage(balloon,ballx,bally,this);





            }



// *******MOVE COLLISION TO ANOTHER MAETHOD****//
// GRAVITY http://stackoverflow.com/questions/6111574/a-player-falling-system-basically-gravity
    /// ANGLED COLLISIONS
    // http://stackoverflow.com/questions/27599173/computing-collision-angles
    // https://gamedevelopment.tutsplus.com/tutorials/when-worlds-collide-simulating-circle-circle-collisions--gamedev-769

    public void actionPerformed(ActionEvent e){

                if(x==(ballx) && y==(bally) || x <= (ballx+100) && y<=(bally+130) && x >= ballx && y>=bally ) {
                    ballvy = -(Math.abs(ballvy));


                }



                if (x < 0 || x > 1920){
                    velx = -velx;
                }
                if (y < 0 || y >1080){
                    vely = -vely;
                }
        if (ballx < 0 || ballx > 1920){
            ballvx = -ballvx;
        }
        if (bally < 0 || bally >1080){
            ballvy = -ballvy;
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

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e){
                x = e.getX();
                y = e.getY();
                repaint();

            }
            public void keyTyped(KeyEvent e) {}
            public void keyReleased(KeyEvent e) {}

        }

