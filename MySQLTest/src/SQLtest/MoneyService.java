package SQLtest;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyService {
	 static final int pagecnt = 5;
	   
	   int DefaultScreen() {
	      MoneyDAO moneyDAO = new MoneyDAO();
	      int count = moneyDAO.count();
	      ArrayList<MoneyDTO> arr = moneyDAO.List(count, pagecnt);
	      
	      System.out.println("����   ��¥           �׸�             ����         ����         ����");
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
	      System.out.println("�� ���� : "+moneyDAO.TotalReceived());
	      System.out.println("�� ���� : "+moneyDAO.TotalPaid());
	      System.out.println("�����ܾ� : " +moneyDAO.Balance());
	      
	      System.out.println("1.���� 2.���� 3.���� 4. ����");
	      Scanner scan = new Scanner(System.in);
	       int input = scan.nextInt();
	       return input;
	   }
	      int DeleteScreen() {
	         System.out.println("����� ���� �Ͻðڽ��ϱ�?");
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

