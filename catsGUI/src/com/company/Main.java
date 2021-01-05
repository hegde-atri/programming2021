package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame = new JFrame("LogIn");
	frame.setContentPane(new LogIn().Jpa);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
    }
}
