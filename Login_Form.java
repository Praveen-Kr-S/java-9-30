package Learn_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_Form implements ActionListener {
	
	JFrame f;
	JLabel title,l3,l4;
	JTextField t3,t4;
	
	JButton b;
	
	public void lg() {
		f = new JFrame("Register Page");
		f.setSize(1920,1080);
		f.getContentPane().setBackground(Color.GRAY);
		f.setLayout(null);
		f.setVisible(true);
		
		
		title = new JLabel("Login Form");
		title.setBounds(600, 100, 300, 45);
		title.setFont(new Font("Arial",Font.BOLD,40));
		title.setForeground(Color.ORANGE);
		f.add(title);
		
		
		l3 = new JLabel("User Email : ");
		l3.setBounds(500, 200, 300, 30);
		l3.setFont(new Font("Arial",Font.BOLD,25));
		l3.setForeground(Color.WHITE);
		f.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(670, 200, 300, 30);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		t3.setForeground(Color.WHITE);
		t3.setBackground(Color.GRAY);
		f.add(t3);
		
		l4 = new JLabel("Password : ");
		l4.setBounds(500, 280, 300, 30);
		l4.setFont(new Font("Arial",Font.BOLD,25));
		l4.setForeground(Color.WHITE);
		f.add(l4);
		
		t4 = new JPasswordField();
		t4.setBounds(670, 280, 300, 30);
		t4.setFont(new Font("Arial",Font.BOLD,25));
		t4.setForeground(Color.WHITE);
		t4.setBackground(Color.GRAY);
		f.add(t4);
		
		
		b =new JButton("Login");
		b.setBounds(630, 380, 150, 50);
		b.setFont(new Font("Arial",Font.BOLD,35));
		b.setForeground(Color.ORANGE);
		b.setBackground(Color.WHITE);
		b.addActionListener(this);
		f.add(b);
	}

	public static void main(String[] args) {
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String x3 = t3.getText();
		String x4 = t4.getText();
		
		if(x3.equals("") || x4.equals("")) {
			new JOptionPane().showMessageDialog(f, "Fill All the Fields");
		}
		else {
			
			try {
				String url = "jdbc:mysql://localhost:3306/aa_tech";
				String user = "root";
				String password = "root";
				Connection c = DriverManager.getConnection(url,user,password);
				PreparedStatement  ps = c.prepareStatement(" select * from users where email=? and password=? ");
				ps.setString(1, x3);
				ps.setString(2, x4);
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
//					c.commit();
					c.close();
					new JOptionPane().showMessageDialog(f, "Login Successfully..");
				}
				else {
					new JOptionPane().showMessageDialog(f, "Invaild User..");
//					c.commit();
					c.close();
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}

		
	}

}
