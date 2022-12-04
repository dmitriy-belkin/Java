package Task_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends JFrame implements WindowListener, ActionListener {
    private TextField f = new TextField();
    private JButton b0 = new JButton("0");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton result = new JButton("=");
    private JButton ad = new JButton("+");
    private JButton div = new JButton("/");
    private JButton mult = new JButton("*");
    private JButton sub = new JButton("-");
    private JButton Del = new JButton("C");
    private JButton Cansel = new JButton("D");
    private JButton Change = new JButton("+/-");
    private JButton sq = new JButton("sqrt");
    private String text = "";
    private double a = 0;
    private double b = 0;
    private char z;
    private int l = 65;
    private int m = 65;

    public Calculator() {
        Font ex = new Font("Impact", Font.BOLD, 30);
        setLayout(null);
        setSize(400, 600);
        setVisible(true);
        setLocation(700, 250);
        f.setFont(ex);
        f.setSize(330, 60);
        f.setLocation(25, 25);
        f.setVisible(true);
        add(f);
        Change.setSize(l, m);
        Change.setLocation(25, 465);
        Change.setVisible(true);
        Change.addActionListener(this);
        add(Change);
        b0.setFont(ex);
        b0.setSize(l, m);
        b0.setLocation(105, 465);
        b0.setVisible(true);
        b0.addActionListener(this);
        add(b0);
        sq.setSize(l, m);
        sq.setLocation(185, 465);
        sq.setVisible(true);
        sq.addActionListener(this);
        add(sq);
        b1.setFont(ex);
        b1.setSize(l, m);
        b1.setLocation(25, 385);
        b1.setVisible(true);
        b1.addActionListener(this);
        add(b1);
        b2.setFont(ex);
        b2.setSize(l, m);
        b2.setLocation(105, 385);
        b2.setVisible(true);
        b2.addActionListener(this);
        add(b2);
        b3.setFont(ex);
        b3.setSize(l, m);
        b3.setLocation(185, 385);
        b3.setVisible(true);
        b3.addActionListener(this);
        add(b3);
        b4.setFont(ex);
        b4.setSize(l, m);
        b4.setLocation(25, 305);
        b4.setVisible(true);
        b4.addActionListener(this);
        add(b4);
        b5.setFont(ex);
        b5.setSize(l, m);
        b5.setLocation(105, 305);
        b5.setVisible(true);
        b5.addActionListener(this);
        add(b5);
        b6.setFont(ex);
        b6.setSize(l, m);
        b6.setLocation(185, 305);
        b6.setVisible(true);
        b6.addActionListener(this);
        add(b6);
        b7.setFont(ex);
        b7.setSize(l, m);
        b7.setLocation(25, 225);
        b7.setVisible(true);
        b7.addActionListener(this);
        add(b7);
        b8.setFont(ex);
        b8.setSize(l, m);
        b8.setLocation(105, 225);
        b8.setVisible(true);
        b8.addActionListener(this);
        add(b8);
        b9.setFont(ex);
        b9.setSize(l, m);
        b9.setLocation(185, 225);
        b9.setVisible(true);
        b9.addActionListener(this);
        add(b9);
        Del.setFont(ex);
        Del.setSize(l, m);
        Del.setLocation(265, 225);
        Del.setVisible(true);
        Del.addActionListener(this);
        add(Del);
        result.setFont(ex);
        result.setSize(l, 147);
        result.setLocation(265, 385);
        result.setVisible(true);
        result.addActionListener(this);
        add(result);
        ad.setFont(ex);
        ad.setSize(l, m);
        ad.setLocation(25, 145);
        ad.setVisible(true);
        ad.addActionListener(this);
        add(ad);
        sub.setFont(ex);
        sub.setSize(l, m);
        sub.setLocation(105, 145);
        sub.setVisible(true);
        sub.addActionListener(this);
        add(sub);
        mult.setFont(ex);
        mult.setSize(l, m);
        mult.setLocation(185, 145);
        mult.setVisible(true);
        mult.addActionListener(this);
        add(mult);
        div.setFont(ex);
        div.setSize(l, m);
        div.setLocation(265, 145);
        div.setVisible(true);
        div.addActionListener(this);
        add(div);
        Cansel.setFont(ex);
        Cansel.setSize(l, m);
        Cansel.setLocation(265, 305);
        Cansel.setVisible(true);
        Cansel.addActionListener(this);
        add(Cansel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sq) {
            double c = Integer.parseInt(f.getText());
            c = Math.sqrt(c);
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource() == Change) {
            int c = Integer.parseInt(f.getText());
            c = c * -1;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);
        }
        if (e.getSource() == b0) {
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource() == b1) {
            text = text + b1.getText();
            f.setText(text);
        }
        if (e.getSource() == b2) {
            text = text + b2.getText();
            f.setText(text);
        }
        if (e.getSource() == b3) {
            text = text + b3.getText();
            f.setText(text);
        }
        if (e.getSource() == b4) {
            text = text + b4.getText();
            f.setText(text);
        }
        if (e.getSource() == b5) {
            text = text + b5.getText();
            f.setText(text);
        }
        if (e.getSource() == b6) {
            text = text + b6.getText();
            f.setText(text);
        }
        if (e.getSource() == b7) {
            text = text + b7.getText();
            f.setText(text);
        }
        if (e.getSource() == b8) {
            text = text + b8.getText();
            f.setText(text);
        }
        if (e.getSource() == b9) {
            text = text + b9.getText();
            f.setText(text);
        }
        if (e.getSource() == Del) {
            text = "";
            f.setText(text);
        }
        if (e.getSource() == ad) {
            a = Integer.parseInt(text);
            f.setText(text + ad.getText());
            text = "";
            z = '+';
        }
        if (e.getSource() == sub) {
            a = Integer.parseInt(text);
            f.setText(text + sub.getText());
            text = "";
            z = '-';
        }
        if (e.getSource() == mult) {
            a = Integer.parseInt(text);
            f.setText(text + mult.getText());
            text = "";
            z = '*';
        }
        if (e.getSource() == div) {
            a = Integer.parseInt(text);
            f.setText(text + div.getText());
            text = "";
            z = '/';
        }
        if (e.getSource() == Cansel) {
            int c = Integer.parseInt(f.getText());
            c = c / 10;
            f.setText(String.valueOf(c));
            text = String.valueOf(c);

        }
        if (e.getSource() == result) {
            if (z == '+') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a + b));
            }
            if (z == '*') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a * b));
            }
            if (z == '-') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a - b));
            }
            if (z == '/') {
                b = Integer.parseInt(text);
                f.setText(String.valueOf(a / b));
            }
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

}