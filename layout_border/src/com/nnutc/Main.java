package com.nnutc;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new MyFrame("BorderLayout");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 300);
        myFrame.setVisible(true);
    }

}
