package com.nnutc;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {
    JPanel root;
    JLabel northLabel;
    JLabel southLabel;
    JLabel westLabel;
    JLabel eastLabel;
    JLabel centerLabel;

    public class ColorLabel extends JLabel {
        public ColorLabel(String txt,Color color) {
            this.setText(txt);
//            组件被设置为不透明
            this.setOpaque(true);
            this.setBackground(color);
//            this.setPreferredSize(new Dimension(60, 30));
//            水平居中对齐
            this.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }

    public MyFrame(String title) {
        super(title);
        root = new JPanel();
        root.setLayout(new BorderLayout());

        northLabel = new ColorLabel("北边",Color.BLUE);
        southLabel = new ColorLabel("南边",Color.YELLOW);
        westLabel = new ColorLabel("西边",Color.WHITE);
        eastLabel = new ColorLabel("东边",Color.RED);
        centerLabel = new ColorLabel("中间",Color.cyan);

        root.add(northLabel, BorderLayout.NORTH);
        root.add(southLabel, BorderLayout.SOUTH);
        root.add(westLabel, BorderLayout.WEST);
        root.add(eastLabel, BorderLayout.EAST);
        root.add(centerLabel, BorderLayout.CENTER);

//        将面板设置为内容面板
        this.setContentPane(root);
    }

}
