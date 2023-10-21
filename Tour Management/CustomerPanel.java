import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import JavaFile.*;
import java.util.*;

public class CustomerPanel extends JFrame //implements ActionListener
{
	public CustomerPanel() {
		

		setSize(900,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		this.setLocationRelativeTo(null);// my add

		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0, 450,400);
		p1.setBackground(Color.BLACK);
		add(p1);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("picture/Hill.jpeg"));
	    Image i2=i1.getImage().getScaledInstance(450,400,Image.SCALE_DEFAULT);
	    ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
	    image.setBounds(0,0,450,400);
	    p1.add(image);
		JButton b1=new JButton("HILL");
		b1.setBounds(180,320,60,20);
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.RED);
		p1.add(b1);
		
		JPanel p2=new JPanel();
		p2.setBounds(450,0,450,400);
		p2.setLayout(null);
		this.add(p2);
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("picture/Beach.jpeg"));
	    Image i5=i4.getImage().getScaledInstance(450,400,Image.SCALE_DEFAULT);
	    ImageIcon i6=new ImageIcon(i5);
	    JLabel img =new JLabel(i6);
	    img.setBounds(0,0,450,400);
	    p2.add(img);
		JButton b2=new JButton("BEACH");
		b2.setBounds(180,320,80,20);
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.RED);
		p2.add(b2);
		
        setVisible(true);
		
	}
}

