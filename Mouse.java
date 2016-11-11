import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Mouse extends JFrame{

    JLabel text = new JLabel("");
    JPanel [] p = new JPanel[5];

    public Mouse (){
        super("Welcome mouse!");
        //setLayout(new BorderLayout());
        for (int i = 0; i < 5; i++){
            p[i] = new JPanel();
        }
        p[0].setBackground(new Color(86, 222, 39));
        p[1].setBackground(new Color(234, 135, 73));
        p[2].setBackground(new Color(100, 255, 229));
        p[3].setBackground(new Color(254, 85, 79));
        p[4].setBackground(new Color(255, 129, 255));
        p[4].setPreferredSize(new Dimension(100, 20));
        p[0].setPreferredSize(new Dimension(100, 100));

        add(p[1], BorderLayout.NORTH);
        add(p[2], BorderLayout.SOUTH);
        add(p[3], BorderLayout.EAST);
        add(p[4], BorderLayout.WEST);
        add(p[0], BorderLayout.CENTER);
        add(text);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 500);
        setSize(580, 300);

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
                text.setText("Добро пожаловать в  ");
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {}

        });

        p[2].addMouseListener(new MouseListener()

        {

            public void mouseExited(MouseEvent a) {
                text.setText("");
            }

            public void mouseClicked(MouseEvent a) {
            }

            public void mouseEntered(MouseEvent a) {
                text.setText("Добро пожаловать Абха ");
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {}

        });

        p[3].addMouseListener(new MouseListener()

        {

            public void mouseExited(MouseEvent a) {
                text.setText("");
            }

            public void mouseClicked(MouseEvent a) {
            }

            public void mouseEntered(MouseEvent a) {
                text.setText("Добро пожаловать в Дахране");
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {}

        });
        p[4].addMouseListener(new MouseListener()

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

        setVisible(true);
    }

    public static void main(String[] args) {
        new Mouse();
    }
}