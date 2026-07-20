package Learn_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Learn_JDBC {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/alpa_tech";
		String pass = "root";
		String user = "root";
		
		Connection c = DriverManager.getConnection(url,pass,user);

//		Create Database
//		PreparedStatement ps = c.prepareStatement("create database alpa_tech");
		
//		Create table
//		PreparedStatement ps = c.prepareStatement("create table staff(id int,name varchar(50),dept varchar(50),salary int)");
		
//		Data Insert
//		PreparedStatement ps = c.prepareStatement("insert into staff values(1,'Ragul','Development',100000)");
//		PreparedStatement ps = c.prepareStatement("insert into staff values(2,'Subash','Testing',150000),(3,'Pradeepan','AI',200000)");
//		PreparedStatement ps = c.prepareStatement("insert into staff values(?,?,?,?)");
//		ps.setInt(1, 4);
//		ps.setString(2, "Praveen");
//		ps.setString(3, "Development");
//		ps.setInt(4, 45000);
		
//		Update Data
//		PreparedStatement ps = c.prepareStatement(" update staff set name = 'Praveen Kumar' where id=4 ");
		
		
//		Delete Data
//		PreparedStatement ps = c.prepareStatement(" delete from staff where id=4 ");
		
//		edit table columns -> add/delete
//		PreparedStatement ps = c.prepareStatement(" alter table staff add column phone int ");
//		PreparedStatement ps = c.prepareStatement(" alter table staff drop column phone ");
	
//		ps.execute();
//		ps.close();
		
		PreparedStatement ps = c.prepareStatement(" select * from staff where id = ? and dept=? ");
		ps.setInt(1, 2);
		ps.setString(2, "Testing");
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"  "+rs.getString("dept")+" "+rs.getInt("salary"));
		}
		
		ps.close();
		

	}

}
