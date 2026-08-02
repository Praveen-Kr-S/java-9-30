package Learn_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LgPage implements ActionListener {
	
	
	
	
	JFrame f;
	JLabel rg_title,l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	
	
	
	public void lg() {
		f = new JFrame();
		f.setSize(1920,1080);
		f.getContentPane().setBackground(Color.DARK_GRAY);
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\prave\\Downloads\\flower.jpg")));
		f.setLayout(null);
		f.setVisible(true);
		
		
		rg_title = new JLabel("Login Form");
		rg_title.setBounds(650,250,300,45);
		rg_title.setFont(new Font("Arial",Font.BOLD,40));
		rg_title.setForeground(Color.ORANGE);
		f.add(rg_title);
		
		

		
//		register user Email
		l3 = new JLabel("User Email : ");
		l3.setBounds(550,350,200,30);
		l3.setFont(new Font("Arial",Font.ITALIC,25));
		l3.setForeground(Color.white);
		f.add(l3);
		t3 = new JTextField();
		t3.setBounds(700,350,250,30);
		t3.setFont(new Font("Arial",Font.ITALIC,25));
		t3.setForeground(Color.white);
		t3.setBackground(Color.gray);
		f.add(t3);
		
		
		
//		register Password
		l4 = new JLabel("Password : ");
		l4.setBounds(550,420,200,30);
		l4.setFont(new Font("Arial",Font.ITALIC,25));
		l4.setForeground(Color.white);
		f.add(l4);
		t4 = new JPasswordField();
		t4.setBounds(700,420,250,30);
		t4.setFont(new Font("Arial",Font.ITALIC,25));
		t4.setForeground(Color.white);
		t4.setBackground(Color.gray);
		f.add(t4);
		
		
		JButton b = new JButton("Login");
		b.setBounds(700,500,150,50);
		b.setFont(new Font("Arial",Font.ITALIC,30));
		f.add(b);
		b.addActionListener(this);
		
		
	}
	

	public static void main(String[] args) {
		
		LgPage l = new LgPage();
		l.lg();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String email = t3.getText();
		String password = t4.getText();
		
		if(email.equals("") || password.equals("") ) {
			JOptionPane.showMessageDialog(f, "Fill All the Fields");
		}
		else {
			String url = "jdbc:mysql://localhost:3306/aa_tech";
			String user = "root";
			String pass = "root";
			
			
			try {
				Connection c = DriverManager.getConnection(url,user,pass);
				PreparedStatement ps = c.prepareStatement("select * from users where email = ? and password = ?");
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					JOptionPane.showMessageDialog(f, "Login Success!!");
					DgPage d = new DgPage();
					d.dg();
				}
				else {
					JOptionPane.showMessageDialog(f, "Invaild User!!");
				}
				ps.execute();
				ps.close();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
		}
		
		
	}

}
