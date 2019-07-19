package test5;

public class Hero {
	String name;
	int hp;
	int now_hp;
	
	 Hero(String name, int hp) {
		 this.name=name;
		 this.hp=hp;
		 now_hp=hp;
	 }

	void punch(Hero a) {
		System.out.println(name + "ÀÇ ÆÝÄ¡");
		a.now_hp -=10;
		System.out.println("          " +a.name + ":"  + a.now_hp+"/" +a.hp);
		
	}
}
