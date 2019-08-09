package p162;

public class Student {
	
	//切积捞抚
	public String name;
	//切积己利
	public int score;
	
	Student(){
		
	}
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}


	@Override
	public String toString() {
		return name + ":" +score;
	}


}
