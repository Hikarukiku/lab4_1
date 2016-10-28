/**
 * Created on 28.10.16.
 */
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Mouse extends JFrame{
    JLabel text = new JLabel("");
    JPanel [] p = new JPanel[5];

    Mouse (){
        super("Welcome mouse!");
        p[0].addMouseListener(new MouseListener()

        {

            public void mouseExited(MouseEvent a) {
                text.setText("");
            }

            public void mouseClicked(MouseEvent a) {
            }

            public void mouseEntered(MouseEvent a) {
                text.setText("Добро пожаловать в ");
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }

        });

        p[1].addMouseListener(new MouseListener()

        {

            public void mouseExited(MouseEvent a) {
                text.setText("");
            }

            public void mouseClicked(MouseEvent a) {
            }

            public void mouseEntered(MouseEvent a) {
                text.setText("Добро пожаловать в Джидда ");
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {}

        });

        add(p[0]);
        add(p[1]);
        add(p[2]);
        add(p[3]);
        add(p[4]);
        add(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 500);
        setSize(580, 300);
        setVisible(true);
    }

}
