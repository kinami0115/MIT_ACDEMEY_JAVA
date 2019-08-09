package p192;

public class CallTest {

	public static void main(String[] args) {
		Call call=new Call();
		
		//call.caller();
		
		try {
			call.callee();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
