package SQLtest;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyService {
	 static final int pagecnt = 5;
	   
	   int DefaultScreen() {
	      MoneyDAO moneyDAO = new MoneyDAO();
	      int count = moneyDAO.count();
	      ArrayList<MoneyDTO> arr = moneyDAO.List(count, pagecnt);
	      
	      System.out.println("순번   날짜           항목             내역         수입         수출");
	      for(MoneyDTO value : arr) {
	         System.out.print(value.getNo() + "    ");
	         System.out.print(value.getDate() + "      ");
	         System.out.print(value.getCategory() + "    ");
	         System.out.print(value.getParticulars() + "         ");
	         if(value.getMoney() >0)
	            System.out.println(value.getMoney() + "     ");
	         else System.out.println("                " +value.getMoney());
	         System.out.println("---------------------------");
	      }
	      System.out.println("총 수입 : "+moneyDAO.TotalReceived());
	      System.out.println("총 지출 : "+moneyDAO.TotalPaid());
	      System.out.println("현재잔액 : " +moneyDAO.Balance());
	      
	      System.out.println("1.수입 2.지출 3.수정 4. 삭제");
	      Scanner scan = new Scanner(System.in);
	       int input = scan.nextInt();
	       return input;
	   }
	      int DeleteScreen() {
	         System.out.println("몇번을 삭제 하시겠습니까?");
	         Scanner scan = new Scanner(System.in);
	         int input = scan.nextInt();
	         scan.close();
	         System.out.println(input);
	         return input;
	      }
	      void DeleteRow(int row) {
	         MoneyDAO moneyDAO = new MoneyDAO();
	         moneyDAO.Delete(row);
	      }
}

