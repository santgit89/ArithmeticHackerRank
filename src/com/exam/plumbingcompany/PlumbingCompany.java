package com.exam.plumbingcompany;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlumbingCompany {
    public static void main(String[] args) {
    button();
    }

    public static void button(){
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("Click Here");
        //b.setBounds(50,100,95,30);
        f.add(b);
        f.setSize(400,400);
        f.setVisible(true);
        PlumbingActivities pa= new PlumberX();
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pa.activity1();
            }
        });
    }
}
