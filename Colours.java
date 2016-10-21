/**
 * Created on 21.10.16.
 */

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Colours {
    Color colour = new Color(0, 100, 0);
    JFrame frame = new JFrame("Colours");
    JButton red = new JButton("Red");
    JButton white = new JButton("White");
    JButton blue = new JButton("Blue");
    JButton green = new JButton("Green");

    public Colours(){

        InnerListener listener = new InnerListener();

        red.addActionListener(listener);
        white.addActionListener(listener);
        blue.addActionListener(listener);
        green.addActionListener(listener);

        frame.setLayout(new FlowLayout());

        frame.add(red);
        frame.add(white);
        frame.add(blue);
        frame.add(green);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800, 500);
        frame.setSize(200, 300);
        frame.setVisible(true);
    }

    class InnerListener implements ActionListener {

        public void actionPerformed(ActionEvent ae)

        {

            if(ae.getSource() == red) {
                colour = Color.RED;
            } else if (ae.getSource() == white){
                colour = Color.white;
            } else if (ae.getSource() == blue){
                colour = Color.BLUE;
            } else { colour = Color.GREEN;}

        }

    }

    public static void main(String[] args) {
        new Colours();
    }
}
