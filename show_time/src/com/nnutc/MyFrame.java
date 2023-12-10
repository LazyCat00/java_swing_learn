package com.nnutc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {
    JPanel root;
    JButton timeButton;
    JLabel timeLabel;

    public void showTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String timeStr = simpleDateFormat.format(new Date());
        System.out.println(timeStr);
        timeLabel.setText(timeStr);
    }

    public MyFrame(String title) {
        super(title);
        root = new JPanel();

        timeLabel = new JLabel("00:00:00");

        timeButton = new JButton("显示时间");
//        Lambda表达式
        timeButton.addActionListener((e) -> {
            showTime();
        });


        root.add(timeLabel);
        root.add(timeButton);

//        将面板设置为内容面板
        this.setContentPane(root);
    }

}
