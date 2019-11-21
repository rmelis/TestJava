package Toets1;

public class Spel {

	public static void main(String[] args) {
		Unit speler1 = new Unit();
		speler1.Name = "Rikkert";
		Unit speler2 = new Unit();
		speler2.Name = "Gerry";
		Unit speler3 = new Unit();
		speler3.Name = "Richard";
		Unit speler4 = new Unit();
		speler4.Name = "Barry";
		Unit speler5 = new Unit();
		speler5.Name = "Dirk";
		
		speler1.hit();
		speler2.hit();
		speler3.hit();
		speler4.hit();
		speler5.hit();
	}
}
