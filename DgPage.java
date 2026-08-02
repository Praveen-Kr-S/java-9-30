package Learn_GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DgPage {
	
	JFrame f;
	JLabel dg_title;
	
	
	
	
	public void dg() {
		f = new JFrame();
		f.setSize(1920,1080);
		f.getContentPane().setBackground(Color.ORANGE);
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\prave\\Downloads\\flower.jpg")));
		f.setLayout(null);
		f.setVisible(true);
		
		
		dg_title = new JLabel("Dashboard Form");
		dg_title.setBounds(650,250,400,45);
		dg_title.setFont(new Font("Arial",Font.BOLD,40));
		dg_title.setForeground(Color.DARK_GRAY);
		f.add(dg_title);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
