package com.javaDA;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class loginUsers extends JFrame implements ActionListener{
    private JPanel pannel;
    private JTextField userName;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;

    public loginUsers() {
        setBackground(new Color(186,184,108));
        setBounds(600,300,600,400);
        pannel = new JPanel();
        pannel.setBackground(new Color(0, 0, 0));
        setContentPane(pannel);
        pannel.setLayout(null);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(124,89,95,24);
        pannel.add(l1);

        JLabel l2 = new JLabel("Password:");
        l1.setBounds(124,124,95,24);
        pannel.add(l2);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
