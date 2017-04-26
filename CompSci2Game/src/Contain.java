/**
 * Created by 226784 on 1/25/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.io.File;

import javax.swing.*;
import javax.swing.JLabel;



public class Contain {



    public static void main(String [] args) {



        //new MainMenu();

        JFrame frame = new JFrame();

        Move kk = new Move();
        frame.getContentPane().add(kk);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}

