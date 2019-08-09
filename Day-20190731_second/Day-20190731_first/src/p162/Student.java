package p162;

public class Student {
	
	//학생이름
	public String name;
	//학생성적
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
