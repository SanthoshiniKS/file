
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
public class Scroller implements AdjustmentListener{
    JFrame f=new JFrame();
    JScrollBar s1,s2,s3;
    JTextField T1,T2,T3;
    JLabel l;
    Scroller()
    {
        f=new JFrame();
        s1=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255);
        s1.setBounds(50, 50, 20, 150);
        T1=new JTextField();
        T1.setBounds(50, 250, 30, 20);
        T1.setEditable(false);
        s2=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255);
        s2.setBounds(150, 50, 20, 150);
        T2=new JTextField();
        T2.setBounds(150, 250, 30, 20);
        T2.setEditable(false);
        s3=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255);
        s3.setBounds(250, 50, 20, 150);
        T3=new JTextField();
        T3.setBounds(250, 250, 30, 20);
        T3.setEditable(false);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        l=new JLabel("COLOUR RANGE");
        l.setBounds(100,300,3000,30);
        l.setForeground(Color.red);
        l.setFont(new Font("Impact", Font.BOLD, 20));
        f.add(s1);f.add(T1);
        f.add(s2);f.add(T2);
        f.add(s3);f.add(T3);
        f.add(l);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int red=s1.getValue();
        int green=s2.getValue();
        int blue=s3.getValue();
        T1.setText(String.valueOf(red));
        T2.setText(String.valueOf(green));
        T3.setText(String.valueOf(blue));
        f.getContentPane().setBackground(new Color(red,green,blue));
    }
    public static void main(String[] args) {
         new Scroller();
    }
}

   

