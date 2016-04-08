package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by admin on 4/7/16.
 */
public class AskUserForInputGUI extends JFrame{
    private JTextField nameTextField;
    private JTextField colorTextField;
    private JButton saveAndReturnToMainButton;
    private JPanel userInputRootPanel;

    AskUserForInputGUI(final MainWindowGUI parentComponent) {
        setContentPane(userInputRootPanel);
        pack();
        setVisible(true);

        saveAndReturnToMainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String favoriteColor = colorTextField.getText();
                parentComponent.sendData(name, favoriteColor);
                AskUserForInputGUI.this.dispose();
            }
        });
    }
}
