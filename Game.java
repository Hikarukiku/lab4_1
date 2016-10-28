package guessinggame;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created on 28.10.16.
 */
public class Game extends JFrame {
    JTextField guessfield = new JTextField(2);
    JButton makeguess = new JButton("Guess");
    JLabel intro = new JLabel("This is the guessing game. Guess a number from 0 to 20. You have 3 guesses.");
    JLabel end = new JLabel("");
    Font fnt = new Font("Times new roman",Font.BOLD,10);
    int count = 0;
    Random randgen = new Random();
    int randomNum = randgen.nextInt(20);

    final int MAX = 3;

    Game() {
        super("Guessing Game");
        setLayout(new FlowLayout());
        System.out.println(randomNum);
        makeguess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int guess = Integer.parseInt(guessfield.getText().trim());

                if (count < MAX) {
                    if (guess == randomNum) {
                        end.setText("You got it right! Win!");
                    } else if (guess < randomNum) {
                        end.setText("Try number >");
                        guessfield.setText("");
                    } else if (guess > randomNum) {
                        end.setText("Try number <");
                        guessfield.setText("");
                    }
                    count++;
                } else {
                    end.setText("Sorry, you're out of guesses! Game over.");
                }
            }
        });

        count = 0;

        add(intro);
        add(guessfield);
        add(makeguess);
        add(end);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(800, 500);
        setSize(580, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Game();
    }

}
