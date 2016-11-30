package fcu.iecs.oop.pokemon;

public class GYM {

	public static void fight(Pokemon p1, Pokemon p2) {

		int win;
		win = (int) (Math.random() * 2);

		if (win == 0) {
			System.out.println("\"Winner is [" + p1.getName() + "].\"");
			p1.setcp(500);
		} 
		else {
			System.out.println("\"Winner is [" + p2.getName() + "].\"");
			p2.setcp(500);
		}

	}

}
