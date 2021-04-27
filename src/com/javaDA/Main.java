package com.javaDA;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        loginUsers frame = new loginUsers();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);



    }
}
