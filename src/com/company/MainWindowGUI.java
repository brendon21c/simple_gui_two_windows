package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindowGUI extends JFrame{
    private JButton openWindowForUserInputButton;
    private JPanel mainRootPanel;
    private JLabel userInputLabel;
    private JButton showDialogButton;


    MainWindowGUI() {
        setContentPane(mainRootPanel);
        setPreferredSize(new Dimension(500, 400));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);

        openWindowForUserInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AskUserForInputGUI getUserInput = new AskUserForInputGUI(MainWindowGUI.this);
            }
        });

    }

    //This is called from the other window
    public void sendData(String name, String favoriteColor) {
        userInputLabel.setText("Your name is " + name + " and your favorite color is " + favoriteColor);
    }
}
