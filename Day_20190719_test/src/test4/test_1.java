package test4;

public class test_1 {

	public static void main(String[] args) {
		// ����ó�� ���Ǵ� Ŭ���� count�� ����ÿ�.
		//Ŭ������ Count 
		//�ʵ�� count: Integer (�ʱ�� 0)
		//�޼ҵ�
		
		//add():void -count 1����
		//sub():void -count 1����
		
		Count count = new Count();
		Count count2 = new Count();
		System.out.println(count.count+ "   "  + count2.count);
		count.add();
		count2.add();
		System.out.println(count.count+ "   "  + count2.count);
		count.sub();
		count2.sub();
		System.out.println(count.count+ "   "  + count2.count);
	}
	

}
