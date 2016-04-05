package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 05.04.2016.
 */
public class MainFrom extends  JFrame{
    private JPanel panel;
    private JButton closeBtn;
    private JButton anotherCloseButon;



    public MainFrom() {
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("My first form");
        pack();
        //CloseOperation closeOperation = new CloseOperation();

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        actionListener = e -> System.exit(0);

        closeBtn.addActionListener(actionListener);
        anotherCloseButon.addActionListener(actionListener);
    }

    public static void main(String[] args) {
        new MainFrom();
    }
}
