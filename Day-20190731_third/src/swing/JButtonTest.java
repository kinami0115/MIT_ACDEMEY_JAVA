package swing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class JButtonTest  extends JFrame{
		
		public JButtonTest() {
			super("��ư �׽�Ʈ");
			JPanel buttonPanel = new JPanel();
			JButton btn = new JButton("��ư");
			JToggleButton tgbutton = new JToggleButton("������");
			JLabel lblHobby = new JLabel("���");
			JCheckBox check1 = new JCheckBox("�");
			JCheckBox check2 = new JCheckBox("����");
			JCheckBox check3 = new JCheckBox("��ȭ");
			JLabel lblMale = new JLabel("����");
			JRadioButton rb1 = new JRadioButton("����");
			JRadioButton rb2 = new JRadioButton("����");
			ButtonGroup bg = new ButtonGroup();
			
			buttonPanel.add(btn);
			buttonPanel.add(tgbutton);
			buttonPanel.add(lblHobby);
			buttonPanel.add(check1);
			buttonPanel.add(check2);
			buttonPanel.add(check3);
			bg.add(rb1);
			bg.add(rb2);
			buttonPanel.add(lblMale);
			buttonPanel.add(rb1);
			buttonPanel.add(rb2);
			
			add(buttonPanel);
		
			setLocation(150,200);
			setSize(240,360);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	public static void main(String[] args) {
			new JButtonTest();
			

	}

}
