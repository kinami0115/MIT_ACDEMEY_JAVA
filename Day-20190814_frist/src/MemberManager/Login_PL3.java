package MemberManager;
import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//
//
//  
//
//  @ Project : Untitled
//  @ File Name : Login_PL.java
//  @ Date : 2019-08-14
//  @ Author : 
//
//
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Login_PL3 extends JFrame {
	
	JLabel l_driver, l_ip, l_port, l_db, l_id, l_pw;
	Choice ch_driver;
	JTextField txt_ip, txt_port, txt_db, txt_id, txt_pw;
	JPanel lable_panel, button_panel, select_panel;
	JButton bt_login, bt_cancel;
	
	public Login_PL3() {
		//레이블
		l_driver = new JLabel("Driver");
		l_ip = new JLabel("IP");
		l_port = new JLabel("Port");
		l_db = new JLabel("DataBase");
		l_id = new JLabel("ID");
		l_pw = new JLabel("PassWord");
		
		
		//컴포넌트
		ch_driver = new Choice();
		ch_driver.add("접속할 데이터 베이스를 선택해 주세요");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		txt_ip=new JTextField(30);
		txt_port=new JTextField(30);
		txt_db=new JTextField(30);
		txt_id=new JTextField(30);
		txt_pw=new JTextField(30);
		
		bt_login = new JButton("연결");
		bt_cancel= new JButton("취소");
		
		
		//패널작성
		lable_panel=new JPanel();
		select_panel=new JPanel();
		button_panel=new JPanel();
		
		lable_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,300));
		button_panel.setPreferredSize(new Dimension(400,50));
		
		lable_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));
		
		lable_panel.add(l_driver);
		lable_panel.add(l_ip);
		lable_panel.add(l_port);
		lable_panel.add(l_db);
		lable_panel.add(l_id);
		lable_panel.add(l_pw);
		
		select_panel.add(ch_driver);
		select_panel.add(txt_ip);
		select_panel.add(txt_port);
		select_panel.add(txt_db);
		select_panel.add(txt_id);
		select_panel.add(txt_pw);
		
		button_panel.add(bt_login);
		button_panel.add(bt_cancel);
	
		//프레임 셋
		add(lable_panel, BorderLayout.WEST);
		add(select_panel, BorderLayout.CENTER);
		add(button_panel, BorderLayout.SOUTH);
		
		//종료
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
		
		//화면에 프리젠테이션
		this.setLocation(((this.getToolkit().getScreenSize()).width-this.getWidth())/2,
				((this.getToolkit().getScreenSize()).height-this.getHeight())/2
				);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login_PL3();
	}
}
