package Learn_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class RgPage implements ActionListener {
	
	
	JFrame f;
	JLabel rg_title,l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	
	
	
	public void rg() {
		f = new JFrame();
		f.setSize(1920,1080);
//		f.getContentPane().setBackground(Color.DARK_GRAY);
		ImageIcon icon = new ImageIcon("C:\\Users\\prave\\Downloads\\flower_resize.jpg");
		f.setContentPane(new JLabel(icon));
		f.setLayout(null);
		f.setVisible(true);
		
		
		rg_title = new JLabel("Register Form");
		rg_title.setBounds(650,150,300,45);
		rg_title.setFont(new Font("Arial",Font.BOLD,40));
		rg_title.setForeground(Color.DARK_GRAY);
		f.add(rg_title);
		
//		register user name
		l1 = new JLabel("User Name : ");
		l1.setBounds(550,250,200,30);
		l1.setFont(new Font("Arial",Font.ITALIC,25));
		l1.setForeground(Color.white);
		f.add(l1);
		t1 = new JTextField();
		t1.setBounds(700,250,250,30);
		t1.setFont(new Font("Arial",Font.ITALIC,25));
		t1.setForeground(Color.white);
		t1.setBackground(Color.gray);
		f.add(t1);
		
//		register user Phone
		l2 = new JLabel("User Phone : ");
		l2.setBounds(550,320,200,30);
		l2.setFont(new Font("Arial",Font.ITALIC,25));
		l2.setForeground(Color.white);
		f.add(l2);
		t2 = new JTextField();
		t2.setBounds(700,320,250,30);
		t2.setFont(new Font("Arial",Font.ITALIC,25));
		t2.setForeground(Color.white);
		t2.setBackground(Color.gray);
		f.add(t2);
		
//		register user Email
		l3 = new JLabel("User Email : ");
		l3.setBounds(550,390,200,30);
		l3.setFont(new Font("Arial",Font.ITALIC,25));
		l3.setForeground(Color.white);
		f.add(l3);
		t3 = new JTextField();
		t3.setBounds(700,390,250,30);
		t3.setFont(new Font("Arial",Font.ITALIC,25));
		t3.setForeground(Color.white);
		t3.setBackground(Color.gray);
		f.add(t3);
		
		
		
//		register Password
		l4 = new JLabel("Password : ");
		l4.setBounds(550,460,200,30);
		l4.setFont(new Font("Arial",Font.ITALIC,25));
		l4.setForeground(Color.white);
		f.add(l4);
		t4 = new JPasswordField();
		t4.setBounds(700,460,250,30);
		t4.setFont(new Font("Arial",Font.ITALIC,25));
		t4.setForeground(Color.white);
		t4.setBackground(Color.gray);
		f.add(t4);
		
		
		JButton b = new JButton("Register");
		b.setBounds(700,550,150,50);
		b.setFont(new Font("Arial",Font.ITALIC,30));
		f.add(b);
		b.addActionListener(this);
		
		
	}

	public static void main(String[] args) {
		
		RgPage p1 = new RgPage();
		p1.rg();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = t1.getText();
		String phone = t2.getText();
		String email = t3.getText();
		String password = t4.getText();
		
		if(name.equals("") || phone.equals("") || email.equals("") || password.equals("") ) {
			JOptionPane.showMessageDialog(f, "Fill All the Fields");
		}
		else {
			String url = "jdbc:mysql://localhost:3306/aa_tech";
			String user = "root";
			String pass = "root";
			
			
			try {
				Connection c = DriverManager.getConnection(url,user,pass);
				PreparedStatement ps = c.prepareStatement("insert into users(name,email,phone,password) values(?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, phone);
				ps.setString(4, password);
				ps.execute();
				ps.close();
				JOptionPane.showMessageDialog(f, "Register Sucessfully 👍👍👍");
				f.setVisible(false);
				LgPage l = new LgPage();
				l.lg();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}
		
		
	}

}
