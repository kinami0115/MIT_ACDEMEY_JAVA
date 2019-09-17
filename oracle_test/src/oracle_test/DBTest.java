package oracle_test;

import java.sql.*;

import java.util.Scanner;

public class DBTest {

	
	 
		   public static void main(String[] args) throws ClassNotFoundException, SQLException {
			      Connection conn = null;
			      try {
			         Class.forName("oracle.jdbc.driver.OracleDriver");
			         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			         System.out.println("DB Connection");
			      } catch (ClassNotFoundException e) {
			         e.printStackTrace();
			      }
			      
			      PreparedStatement pstmt = null;
			      ResultSet rs = null;
			      String sql;
			      
			      
			      
			      int exp, inc, cnt;
			      while(true) {
			         sql = "SELECT * FROM mbbok";
			         pstmt = conn.prepareStatement(sql);
			         rs = pstmt.executeQuery();
			         rs.next();
			         int money = rs.getInt(1);
			         
			      System.out.println("���� �ܾ� : " + money + " Menu : " );
			      Scanner menu = new Scanner(System.in);
			      cnt = menu.nextInt();
			      Scanner menucnt = new Scanner(System.in);
			      switch(cnt) {
			         case 1 :
			            System.out.println("���� �ܾ� : " + money);
			            break;
			         case 2 :
			            System.out.println("���� �ݾ� :");
			            exp = menucnt.nextInt();
			            
			            sql = "UPDATE mbbok SET money = money - ?";
			            pstmt = conn.prepareStatement(sql);
			            pstmt.setInt(1, exp);
			            pstmt.executeQuery();
			            break;
			         case 3 :
			            System.out.println("���� �ݾ� : ");
			            inc = menucnt.nextInt();
			            sql = "UPDATE mbbok SET money = money + ?";
			            pstmt = conn.prepareStatement(sql);
			            pstmt.setInt(1, inc);
			            pstmt.executeQuery();
			            break;
			         case 4 :
			            System.exit(0);
			         }
			      }
			   }
			}