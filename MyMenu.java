import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
public class MyMenu extends JFrame{
    //JTextField jta = new JTextField(10);
    JTextArea jta = new JTextArea(10,25);
    JScrollPane scroll = new JScrollPane(jta);
    JMenuBar mb = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem mi = new JMenuItem("lol");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    public MyMenu()

    {

        super("Example");

        setLayout(new FlowLayout());
        menu.add(mi);
        setSize(400,300);
        mb.add(menu);
        //add(jta);
        add(scroll);
        add(mb);


        jta.setForeground(Color.PINK);

        jta.setFont(fnt);

        setVisible(true);

    }

    public static void main(String[]args)

    {

        new MyMenu();

    }

}

