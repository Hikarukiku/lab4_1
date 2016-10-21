package frames;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * Created on 21.10.16.
 */
public class Match {

    int count1, count2;

    JFrame table = new JFrame("Match");
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel ls = new JLabel("Last Scorer: N/A");
    JLabel win = new JLabel("Winner: DRAW");

    public Match(){
        count1 = 0;
        count2 = 0;

        InnerListener listener = new InnerListener();

        milan.addActionListener(listener);

        madrid.addActionListener(listener);

        table.setLayout(new FlowLayout());

        table.add(milan);

        table.add(madrid);

        table.add(result);
        table.add(ls);
        table.add(win);

        table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        table.setLocation(800, 500);
        table.setSize(200, 300);

        table.setVisible(true);
    }

    class InnerListener implements ActionListener {

        public void actionPerformed(ActionEvent ae)

        {

            if(ae.getSource() == milan)

            {

                count1++;
                ls.setText("Last Scorer: AC Milan");


            }

            else

            {

                count2++;
                ls.setText("Last Scorer: Real Madrid");


            }

            result.setText("Result: "+count1+" X "+count2);

            if(count2<count1){
                win.setText("Winner: AC Milan");
            } else if(count1<count2){
                win.setText("Winner: Real Madrid");
            } else {
                win.setText("Winner: DRAW");
            }
        }

    }

    public static void main(String[] args) {
        new Match();
    }


}
