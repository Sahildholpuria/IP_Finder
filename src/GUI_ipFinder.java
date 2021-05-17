package src;

import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI_ipFinder extends JFrame implements ActionListener{

    JLabel l;  
    JTextField tf;  
    JButton b; 

    GUI_ipFinder() {
        super("IP Finder Tool - Javatpoint");  
    l=new JLabel("Enter URL:");  
    l.setBounds(50,70,150,20);;  
    tf=new JTextField();  
    tf.setBounds(50,100,200,20);  
      
    b=new JButton("Find IP");  
    b.setBounds(50,150,80,30);  
    b.addActionListener((java.awt.event.ActionListener) this);  
    add(l);  
    add(tf);  
    add(b);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);

    }

    
    public void actionPerformed(ActionEvent e){  
        String url=tf.getText();  
        try {  
            InetAddress ia=InetAddress.getByName(url);  
            String ip=ia.getHostAddress();  
            JOptionPane.showMessageDialog(this,ip);  
        } catch (UnknownHostException e1) {  
            JOptionPane.showMessageDialog(this,e1.toString());  
        }  
    }  
    
    public static void main(String[] args) {

        new GUI_ipFinder();  
    }



}
