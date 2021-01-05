package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn {
    public JPanel Jpa;
    public JButton msg;

    public LogIn() {
        msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Message successful");
            }
        });
    }
}

