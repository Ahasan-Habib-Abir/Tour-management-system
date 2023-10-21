import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Signup extends JFrame implements ActionListener{
	
	JPanel panel1 = new JPanel();
	JLabel NameLable, userNameLable, userPassLabel, phnNumLabel, DobLabel ;
    JTextField name, userName, phnNum, Dob;
    JPasswordField password;
    JButton btnCreate, btnBack;
    Font font = new Font("cambria", Font.PLAIN, 20);
	
	public  Signup(){
        super("Signup");
        this.setSize(900, 400);
        //this.setLocation(700, 400);
        this.setLocationRelativeTo(null);// my add
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		//Jpanel 1
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(0,0,500,400);
		panel1.setLayout(null);
		this.add(panel1);
		
		JPanel p2=new JPanel();
		p2.setBounds(500,0,400,400);
		p2.setLayout(null);
		this.add(p2);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("picture/login.jpeg"));
	    Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
	    ImageIcon i3=new ImageIcon(i2);
	    JLabel image =new JLabel(i3);
	    image.setBounds(0,0,400,400);
	    p2.add(image);;
		
		//NAME Lable
        NameLable = new JLabel("Enter Name");
        NameLable.setBounds(80, 50, 150, 25);
        NameLable.setFont(font);
        panel1.add(NameLable);
		//USER NAME TextField
        name = new JTextField("");
        name.setBounds(250, 50, 150, 25);
        name.setFont(font);
        panel1.add(name);
		
		
		//Phone Number Lable
        phnNumLabel = new JLabel("Phone number ");
        phnNumLabel.setBounds(80, 100, 150, 25);
        phnNumLabel.setFont(font);
        panel1.add(phnNumLabel);
		//Phone Number TextField
        phnNum = new JTextField("");
        phnNum.setBounds(250, 100, 150, 25);
        phnNum.setFont(font);
        panel1.add(phnNum);
		
		
		//Dob Label
        DobLabel = new JLabel("Enter D.O.B ");
        DobLabel.setBounds(80, 150, 150, 25);
        DobLabel.setFont(font);
        panel1.add(DobLabel);
		//Dob TextField
        Dob = new JTextField("");
        Dob.setBounds(250, 150, 150, 25);
        Dob.setFont(font);
        panel1.add(Dob);
		
		
		
		///USER NAME Lable
        userNameLable = new JLabel("User Name");
        userNameLable.setBounds(80, 200, 150, 25);
        userNameLable.setFont(font);
        panel1.add(userNameLable);
		//USER NAME TextField
        userName = new JTextField("");
        userName.setBounds(250, 200, 150, 25);
        userName.setFont(font);
        panel1.add(userName);
		
		
		//User Password Label 
        userPassLabel = new JLabel("Password");
        userPassLabel.setBounds(80, 250, 150, 25);
        userPassLabel.setFont(font);
        panel1.add(userPassLabel);
		//User Password Password Field
        password = new JPasswordField("");
        password.setBounds(250, 250, 150, 25);
		password.setEchoChar('*');
        password.setFont(font);
        panel1.add(password);
		
		
		
		btnBack = new JButton("Create");
        btnBack.setBounds(80, 300, 100, 30);
        btnBack.setFont(font);
        //btnBack.addActionListener(this);
        panel1.add(btnBack);
		

        btnCreate = new JButton("Back");
        btnCreate.setBounds(280, 300, 100, 30);
        btnCreate.setFont(font);
        btnCreate.addActionListener(this);
        panel1.add(btnCreate);
		
		
		
		
        this.setVisible(true);

    }
	
	public void actionPerformed(ActionEvent e) {
		
		String n = name.getText();
		String phNum = phnNum.getText();
		String dob = Dob.getText();
		String uName =  userName.getText();
		String pword = password.getText();
		
		if (e.getSource() == btnCreate) {
			
			try {
				File file = new File("data.txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fw);
				PrintWriter printWriter = new PrintWriter(bufferedWriter);
				printWriter.println("Name : " + n);
				printWriter.println("D.O.B : " +dob);
				printWriter.println("PHONE NUMBER : " + phNum);
				printWriter.println("User Name : " + uName);
				printWriter.println("password : " + pword);
				printWriter.println("===========================================");
				printWriter.close();
				
				}
				
				catch (Exception ex) {
						System.out.println(ex);
				}
					JOptionPane.showMessageDialog(null, "SignUp Successfull");
					dispose();
					Login login = new Login();
			        login.setVisible(true);
			        this.setVisible(false);	
		}
		
		    else if (e.getSource() == btnBack ) {
			dispose();
			Login login = new Login();
			this.setVisible(false);
			login.setVisible(true);
		}
		
		
		
	}
	
	
	
    
}
