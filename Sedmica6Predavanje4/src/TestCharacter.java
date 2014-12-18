
public class TestCharacter {
	public static void main(String[] args) {
		Weapon bow = new Weapon(15, 17, 22);
		
		Character atributi= new Character("Mirya", 500, 11, bow, 11, 12);
		System.out.println(atributi.toString());
	}

}
