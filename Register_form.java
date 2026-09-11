package Learn_GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register_form implements ActionListener {
	
	JFrame f;
	JLabel title,l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b;
	
	public void rg(){
		f = new JFrame("Register Page");
		f.setSize(1920,1080);
//		f.getContentPane().setBackground(Color.GRAY);
		ImageIcon icon = new ImageIcon("C:\\Users\\prave\\Downloads\\flower_resize.jpg");
		f.setContentPane(new JLabel(icon));
		f.setLayout(null);
		f.setVisible(true);
		
		
		title = new JLabel("Register Form");
		title.setBounds(600, 100, 300, 45);
		title.setFont(new Font("Arial",Font.BOLD,40));
		title.setForeground(Color.ORANGE);
		f.add(title);
		
		l1 = new JLabel("User Name : ");
		l1.setBounds(500, 200, 300, 30);
		l1.setFont(new Font("Arial",Font.BOLD,25));
		l1.setForeground(Color.WHITE);
		f.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(670, 200, 300, 30);
		t1.setFont(new Font("Arial",Font.BOLD,25));
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.GRAY);
		f.add(t1);
		
		
		l2 = new JLabel("User Phone : ");
		l2.setBounds(500, 280, 300, 30);
		l2.setFont(new Font("Arial",Font.BOLD,25));
		l2.setForeground(Color.WHITE);
		f.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(670, 280, 300, 30);
		t2.setFont(new Font("Arial",Font.BOLD,25));
		t2.setForeground(Color.WHITE);
		t2.setBackground(Color.GRAY);
		f.add(t2);
		
		
		
		
		l3 = new JLabel("User Email : ");
		l3.setBounds(500, 360, 300, 30);
		l3.setFont(new Font("Arial",Font.BOLD,25));
		l3.setForeground(Color.WHITE);
		f.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(670, 360, 300, 30);
		t3.setFont(new Font("Arial",Font.BOLD,25));
		t3.setForeground(Color.WHITE);
		t3.setBackground(Color.GRAY);
		f.add(t3);
		
		
		
		
		l4 = new JLabel("Password : ");
		l4.setBounds(500, 440, 300, 30);
		l4.setFont(new Font("Arial",Font.BOLD,25));
		l4.setForeground(Color.WHITE);
		f.add(l4);
		
		t4 = new JPasswordField();
		t4.setBounds(670, 440, 300, 30);
		t4.setFont(new Font("Arial",Font.BOLD,25));
		t4.setForeground(Color.WHITE);
		t4.setBackground(Color.GRAY);
		f.add(t4);
		
		
		b =new JButton("Register");
		b.setBounds(630, 540, 200, 50);
		b.setFont(new Font("Arial",Font.BOLD,35));
		b.setForeground(Color.ORANGE);
		b.setBackground(Color.WHITE);
		b.addActionListener(this);
		f.add(b);
		
		
		
	}
	

	public static void main(String[] args) {
			
		Register_form r = new Register_form();
		r.rg();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		String x1 = t1.getText();
		String x2 = t2.getText();
		String x3 = t3.getText();
		String x4 = t4.getText();
		
		if(x1.equals("") || x2.equals("") || x3.equals("") || x4.equals("")) {
			new JOptionPane().showMessageDialog(f, "Fill All the Fields");
		}
		else {
			
			try {
				String url = "jdbc:mysql://localhost:3306/aa_tech";
				String user = "root";
				String password = "root";
				Connection c = DriverManager.getConnection(url,user,password);
				PreparedStatement  ps = c.prepareStatement("insert into users(name,phone,email,password) values(?,?,?,?)");
				ps.setString(1, x1);
				ps.setString(2, x2);
				ps.setString(3, x3);
				ps.setString(4, x4);
				ps.execute();
				c.close();
				new JOptionPane().showMessageDialog(f, "Register Successfully..");
				
				Demo_Login l = new Demo_Login();
				l.lg();
				
				f.setVisible(false);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}

}
