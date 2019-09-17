import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;

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




public class Login_PL extends JFrame {
	
	JLabel l_driver;
	Choice ch_driver;
	JPanel lable_panel;
	JPanel select_panel;
	
	public Login_PL() {
		//레이블
		l_driver = new JLabel("Driver");
		
		//컴포넌트
		ch_driver = new Choice();
		ch_driver.add("접속할 데이터 베이스를 선택해 주세요");
		ch_driver.add("MySql");
		ch_driver.add("Oracle");
		
		//패널작성
		lable_panel=new JPanel();
		select_panel=new JPanel();
	
		lable_panel.setPreferredSize(new Dimension(100,200));
		select_panel.setPreferredSize(new Dimension(300,300));
		
		lable_panel.setLayout(new GridLayout(6,1,10,10));
		select_panel.setLayout(new GridLayout(6,1,10,10));
		
		lable_panel.add(l_driver);
		
		select_panel.add(ch_driver);
	
		//프레임 셋
		add(lable_panel, BorderLayout.WEST);
		add(select_panel, BorderLayout.CENTER);
		
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
		new Login_PL();
	}
}
