
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  


public class Conversion implements ActionListener{
    JFrame f=new JFrame();
    JTextField T1,T2;
    JLabel l1,l2,l3;
    JButton b;
    Container c=f.getContentPane();
    Conversion()
    {
        l1=new JLabel("CONVERTING MILES TO KILOMETRES");
        l1.setBounds(50,50,2000,20);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Constantia", Font.BOLD, 20));
        l2=new JLabel("Miles:");
        l2.setBounds(50,150,100,30);
        l2.setForeground(Color.red);
        l3=new JLabel("KiloMetre:");
        l3.setBounds(50,250,100,30);
        l3.setForeground(Color.red);
        T1=new JTextField();
        T1.setBounds(150,150,100,20);
        T2=new JTextField();
        T2.setBounds(150,250,100,20);
        T2.setEditable(false);
        b=new JButton("CONVERT");
        b.setBounds(100,350,100,20);
        b.setBackground(Color.CYAN);
        b.setFont(new Font("Constantia", Font.BOLD, 10));
        b.addActionListener(this);
        f.add(l1);
        f.add(l2);f.add(T1);
        f.add(l3);f.add(T2);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setTitle("Conversion From Miles to Kilometres");
        f.getContentPane().setBackground(Color.PINK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent a)
    {
        String s1=T1.getText();  
        int m=Integer.parseInt(s1);  
        double km=1.607;
        double c=0;  
       
        if(a.getSource()==b)
        {  
            c=m*km;  
        }
         
        String result=String.valueOf(c);  
        T2.setText(result);  
    }
    public static void main(String[] args) {
        new Conversion();
    }
    
}

