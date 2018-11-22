package com.example.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame jFrame;
    private JLabel lblFirst,lblSecond;
    private JTextField txtFirst,txtSecond;
    private JButton btnSum,btnSub,btnMul, btnClose;

    public static void main(String[] args) {
        new Main(); // calls the default constructor
    }
//Default Constructor
    public Main(){
        jFrame = new JFrame("Calculation");
        jFrame.setSize(500,500);
        jFrame.setLayout(null);

        lblFirst = new JLabel("Enter the first number");
        lblFirst.setBounds(20,30,200,30);
        jFrame.add(lblFirst);

        lblSecond = new JLabel("Enter the second number");
        lblSecond.setBounds(20,90,200,30);
        jFrame.add(lblSecond);

        txtFirst = new JTextField();
        txtFirst.setBounds(240,30,200,30);
        jFrame.add(txtFirst);

        txtSecond = new JTextField();
        txtSecond.setBounds(240,90,200,30);
        jFrame.add(txtSecond);

        btnSum = new JButton("Add");
        btnSum.setBounds(80,140,100,30);
        jFrame.add(btnSum);
        btnSub = new JButton("Subtract");
        btnSub.setBounds(260,140,100,30);
        jFrame.add(btnSub);


        btnMul = new JButton("Multiply");
        btnMul.setBounds(80,200,100,30);
        jFrame.add(btnMul);

        btnClose = new JButton("Close");
        btnClose.setBounds(260,200,100,30);
        jFrame.add(btnClose);

        jFrame.setVisible(true );
        jFrame.setLocationRelativeTo(null);

        /*Adding Functionality*/
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum=Integer.parseInt(txtFirst.getText())+ Integer.parseInt(txtSecond.getText());
                JOptionPane.showMessageDialog(null, "The Sum is " + sum);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sub=Integer.parseInt(txtFirst.getText()) - Integer.parseInt(txtSecond.getText());
                JOptionPane.showMessageDialog(null, "The Sum is " + sub);
            }
        });

        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mul=Integer.parseInt(txtFirst.getText()) * Integer.parseInt(txtSecond.getText());
                JOptionPane.showMessageDialog(null, "The Sum is " + mul);
            }
        });

        btnClose.addActionListener(new CloseListener());
    }
}
