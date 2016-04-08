package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindowGUI extends JFrame{
    private JButton openWindowForUserInputButton;
    private JPanel mainRootPanel;
    private JLabel userInputLabel;

    MainWindowGUI() {
        setContentPane(mainRootPanel);
        setPreferredSize(new Dimension(300, 400));
        pack();
        setVisible(true);

        openWindowForUserInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AskUserForInputGUI getUserInput = new AskUserForInputGUI(MainWindowGUI.this);

            }
        });
    }

    public void sendData(String name, String favoriteColor) {
        userInputLabel.setText("Your name is " + name + " and your favorite color is " + favoriteColor);
    }
}
