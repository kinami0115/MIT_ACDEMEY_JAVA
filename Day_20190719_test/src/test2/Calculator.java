package test2;

public class Calculator {
	
	public int x;
    public int y;
    Calculator(int x, int y){
    	this.x =x;
    	this.y=y;
    }
	 int rem(int x, int y) {
		return x%y;
	}

	 double div(int x, int y) {
		return (double)x/y;
	}

	 int sub(int x, int y) {
		return x-y;
	}

	 int mul(int x, int y) {
		return x*y;
	}

	 int add() {
		return x+y;
	 }
	}

