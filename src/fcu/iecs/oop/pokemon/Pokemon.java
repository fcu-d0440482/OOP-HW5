package fcu.iecs.oop.pokemon;

public class Pokemon {

	private final String name;
	private int cp;

	public Pokemon(String name, int cp) {
		this.name = name;
		this.cp = cp;
	}

	public String getName() {
		return name;
	}

	public int getcp() {
		return cp;
	}

	public void setcp(int cp) {
		this.cp = this.cp+cp;
	}

}
