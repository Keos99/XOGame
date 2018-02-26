package XOGameSwing.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init(){
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Крестики нолики");
        jPanel.setLayout(new GridLayout(3,3));

        //jPanel.setLayout(new FlowLayout());

        /*JButton jButton = new JButton("Привет!");
        add(jButton, BorderLayout.CENTER);
        add(new JButton("Swing"),BorderLayout.NORTH);
        add(new JButton("Swing"),BorderLayout.EAST);
        add(new JButton("Swing"),BorderLayout.SOUTH);
        add(new JButton("Swing"),BorderLayout.WEST);*/

        for (int i = 0; i < buttons.length; i++) {
            JButton[] buttonLine = buttons[i];
            for (int j = 0; j < buttonLine.length; j++) {
                JButton jButton = new JButton();
                buttons[i][j] = jButton;
                int finalI = i;
                int finalJ = j;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                       // System.out.println(s);
                        System.out.printf("Кнопка: %s, x: %d, y: %d\n",buttonText, finalI, finalJ);
                    }
                });
                //buttonLine[j] = jButton;
                jPanel.add(jButton);
            }
        }

        add(jPanel);
        setVisible(true);
    }
}
