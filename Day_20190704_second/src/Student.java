//
//�ۼ���:
//�ۼ���
//���: Ŭ������ ��ü�� ���� �� ����� ���




public class Student {
	public String name;
	public int score;
	public static final int MAX_SCORE = 100;
	public void setScore(int newScore) {
	
	}
	
	public void printScore() {
			System.out.println(name + "����" + MAX_SCORE + "�� ������," + score +"�� �Դϴ�.");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	
	}
}
