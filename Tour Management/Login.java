import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{
	
	JPanel p1 = new JPanel();
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("picture/login.jpeg"));
	JPanel p2=new JPanel();
	ImageIcon icon = new ImageIcon("picture/login.jpeg");
	
	JLabel userNameLable, userPassLabel;
    JTextField userName;
    JPasswordField password;
    JButton btnLogin, btnSignup, btnFpass;
    Font font = new Font("cambria", Font.PLAIN, 20);
	

	public Login() {
		this.setSize(900,400);
		this.setLocation(350,200);
		this.setLayout(null);
		this.setLocationRelativeTo(null);// my add
		this.getContentPane().setBackground(Color.WHITE);
		this.setIconImage(icon.getImage());
		
		//panel 1
		p1.setBackground(Color.WHITE);
		p1.setBounds(0,0,400,400);
		p1.setLayout(null);
		this.add(p1);
		
		Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(0,0,400,400);
		p1.add(image);
		
		
		
		//panel 2
		p2.setLayout(null);
		p2.setBounds(400,30,500,350);
		p2.setBackground(Color.BLACK);
		this.add(p2);
		
		
		//USER NAME Lable
        userNameLable = new JLabel("User Name");
        userNameLable.setBounds(60,20,100, 25);
        userNameLable.setFont(font);
		userNameLable.setForeground(Color.WHITE);
        p2.add(userNameLable);
		//USER NAME TextField
        userName = new JTextField("");
        userName.setBounds(180,20,200, 20);
        //userName.setForeground(Color.WHITE);
		userName.setFont(font);
        p2.add(userName);
		
		
		//User Password Label 
        userPassLabel = new JLabel("Password");
        userPassLabel.setBounds(60,80,100,25);
        userPassLabel.setFont(font);
        userPassLabel.setForeground(Color.WHITE);
        p2.add(userPassLabel);
		//User Password Password Field
        password = new JPasswordField("");
        password.setBounds(180,80, 200, 20);
        password.setBorder(BorderFactory.createEmptyBorder());
		password.setEchoChar('*');
        password.setFont(font);
        p2.add(password);
		
		
		//btnLogin
		btnLogin = new JButton("Login");
        btnLogin.setBounds(60,150,100,30);
        btnLogin.setFont(font);
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(Color.BLACK);
        btnLogin.addActionListener(this);
        p2.add(btnLogin);
		
		
		//btnSignup
		btnSignup = new JButton("Signup");
        btnSignup.setBounds(300,150,100,30);
        btnSignup.setFont(font);
		btnSignup.setBackground(Color.WHITE);
		btnSignup.setForeground(Color.BLACK);
        btnSignup.addActionListener(this);
        p2.add(btnSignup);
		
		//btnFpass
	    btnFpass = new JButton("Forget Password");
        btnFpass.setBounds(150, 220,220, 30);
        btnFpass.setFont(font);
		btnFpass.setForeground(Color.RED);
		btnFpass.setBackground(Color.WHITE);
        btnFpass.addActionListener(this);
        p2.add(btnFpass);
		
		
		setVisible(true);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
        
		
		if (e.getSource() == btnLogin) {
            String name = userName.getText();
            String pass = String.valueOf(password.getPassword());

            if (name.equals("mahmud") && pass.equals("1234")) {
				
                CustomerPanel c = new CustomerPanel();

                userName.setText("");
                password.setText("");

                c.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid User Name or Password", 
											  "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
		else if (e.getSource() == btnSignup) {
			Signup signup = new Signup();
			signup.setVisible(true);
			this.setVisible(false);
		}
		
	}
    
	
	/*
	public void actionPerformed(ActionEvent e) {
        if (btnSignup== e.getSource()) {
			Signup signup = new Signup();
			signup.setVisible(true);
			this.setVisible(false);
			} 
	}*/
}
        