package SQLtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MoneyDAO {
	   Connection conn = null;
	   String sql = null;
	   
	   MoneyDAO() {
	      try {         
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         conn = DriverManager.getConnection("jdbc:mysql://localhost/db_money?serverTimezone=UTC","root","1234");
	         System.out.println("connected");
	      }catch (Exception e) {
	         e.printStackTrace();
	         System.out.println("2");
	      }
	   }
	   
	   int count() {
	      sql = "SELECT count(*) FROM diary";
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try {
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	         rs.next();
	         return rs.getInt(1);
	      }catch (Exception e) {
	         e.printStackTrace();
	      }
	      return 1;
	   }
	   
	   int insetMoney (MoneyDTO money) {
	      sql = "INSERT INTO diary VALUES (null,now(),?,?,?)";
	      PreparedStatement pstmt = null;
	      try {
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, money.getCategory());
	         pstmt.setString(2, money.getParticulars());
	         pstmt.setInt(3, money.getMoney());
	         return pstmt.executeUpdate();
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      return -1;
	   }
	   ArrayList<MoneyDTO> List(int cnt, int page) {
	      ArrayList<MoneyDTO> arryDTO = new ArrayList<>();
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      sql = "SELECT *  FROM diary ORDER BY date LIMIT ?, ?";
	      try {
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, cnt-page);
	         pstmt.setInt(2, page);
	         rs = pstmt.executeQuery();
	         while(rs.next()) {
	            MoneyDTO moneyDTO = new MoneyDTO();
	            moneyDTO.setNo(rs.getInt("no"));
	            moneyDTO.setDate(rs.getString("date"));
	            moneyDTO.setCategory(rs.getString("category"));
	            moneyDTO.setParticulars(rs.getString("particulars"));
	            moneyDTO.setMoney(rs.getInt("money"));
	            arryDTO.add(moneyDTO);
	         }
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      return arryDTO;
	   }
	   int TotalReceived() {
		   sql = "select sum(money) from diary where money > 0";
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;
		      
		      try {
		         pstmt = conn.prepareStatement(sql);
		         rs = pstmt.executeQuery();
		         rs.next();
		         return rs.getInt(1);
		      }catch (Exception e) {
		         e.printStackTrace();
		      }
		      return -1;
	   }
	   
	   int TotalPaid() {
		   sql = "select sum(money) from diary where money < 0";
		      PreparedStatement pstmt = null;
		      ResultSet rs = null;
		      
		      try {
		         pstmt = conn.prepareStatement(sql);
		         rs = pstmt.executeQuery();
		         rs.next();
		         return rs.getInt(1);
		      }catch (Exception e) {
		         e.printStackTrace();
		      }
		      return 1;
	  }
	  int Balance() {
		  sql = "select sum(money) from diary";
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      
	      try {
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	         rs.next();
	         return rs.getInt(1);
	      }catch (Exception e) {
	         e.printStackTrace();
	      }
	      return -1;
	   }

	  int Delete(int row) {
	      sql = "DELETE FROM diary WHERE no = ?";
	      PreparedStatement pstmt = null;
	      try {
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setInt(1, row);
	         return pstmt.executeUpdate();
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      return -1;
	   }

	    }


	



