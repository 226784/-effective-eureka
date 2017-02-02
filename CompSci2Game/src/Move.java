/**
 * Created by 226784 on 1/31/2017.
 */

//import java.swing.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.IOException;
import java.net.URL;
import java.awt.image.BufferedImage;

public class Move extends JPanel implements ActionListener,KeyListener {
            Timer timer = new Timer(5, this);
            int ox = 0, oy= 0 , bx = 0 , by=0;

            public Move(){
                timer.start();
                addKeyListener(this);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
            }
    public class DrawPanel extends JPanel {

        // graphics lol = new graphics();

        private BufferedImage image;

        public DrawPanel() {
            URL resource = getClass().getResource("head.png");
            try{
                image = ImageIO.read(resource);
            } catch(IOException e){
                e.printStackTrace();
            }
        }

        public void paintComponent(Graphics g)

        {
          super.paintComponent(g);
            g.drawImage(image, 50, 50, this);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {


                 repaint();
                bx+= ox;
                by+=bx;

    }

    public void keyTyped(KeyEvent e) {}

    public void up(){
        ox = 0;
        oy = 2;

    }

    public void down(){
        ox =0;
        oy = -2;
    }

    public void left(){
        ox = -2;
        oy = 0;
    }

    public void right(){
        ox = 2;
        oy = 0;
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int keyboard = e.getKeyCode();

        if(keyboard == KeyEvent.VK_UP || keyboard == KeyEvent.VK_W){
            up();
        }
        if(keyboard == KeyEvent.VK_DOWN || keyboard == KeyEvent.VK_S){
            down();
        }
        if(keyboard == KeyEvent.VK_RIGHT|| keyboard == KeyEvent.VK_D){
            right();
        }
        if(keyboard == KeyEvent.VK_LEFT || keyboard == KeyEvent.VK_A){
            left();
        }



    }

    public void keyReleased(KeyEvent e) {}
}
