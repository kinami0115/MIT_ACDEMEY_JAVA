package p148;

public class Student {
	public String name;
	
	public int score ;
	
	 Student(String name, int score) {
		 this.name = name;
		 this.score= score;
		}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return name + ":" + score;
	}
}

