public class Character {
	private String name;
	private double hp;
	private double dex;
	private Weapon wpn;
	private double strenght;
	private double speed;

	public Character(String name, double hp, double dex, Weapon wpn,
			double strenght, double speed) {

		this.name = name;
		this.hp = hp;
		this.dex = dex;
		this.wpn = new Weapon(wpn);
		this.strenght = strenght;
		this.speed = speed;
	}

	/**
	 * equals metoda.
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(Character other) {
		if (this.name.equals(other.name) && this.hp == other.hp
				&& this.dex == other.dex && this.wpn.equals(other.wpn)
				&& this.strenght == other.strenght && this.speed == other.speed)
			return true;
		return false;
	}

	public String toString(){
		String out = "Name: " +name +"\nHP: " +hp +"\nDex: " +dex   + "\nStrenght: " +this.strenght + "\nSpeed: " + speed+ "\nWeapon: " + wpn.toString();
		return out;
	}
}
