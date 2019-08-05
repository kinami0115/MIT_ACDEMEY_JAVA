package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

public class IDandPassword extends JFrame {
		
		public IDandPassword() {
			super ("로그인창");
			JPanel buttonPanel = new JPanel();
			JLabel lblat1 = new JLabel("아이디");
			JLabel lblat2 = new JLabel("비밀번호");
			JLabel lblat = new JLabel("아이디와 패스워드를 입력해주세요");
			JToggleButton tgbutton1 = new JToggleButton("로그인");
			JToggleButton tgbutton2 = new JToggleButton("회원가입");
			JTextArea content1 = new JTextArea(3,20);
			JTextArea content2 = new JTextArea(1,13);
			JTextArea content3 = new JTextArea(1,13);
	        JScrollPane s= new JScrollPane(content1);

			
			buttonPanel.add(lblat);
			buttonPanel.add(lblat1);
			buttonPanel.add(content2);
			buttonPanel.add(lblat2);
			buttonPanel.add(content3);
			buttonPanel.add(tgbutton1);
			buttonPanel.add(tgbutton2);
			buttonPanel.add(s);
			add(buttonPanel);
			
			setLocation(150,200);
			setSize(240,360);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
	
	
	public static void main(String[] args) {
		new IDandPassword();
		

}
}
