package Toets1;

public class Unit {
	public int Hitpoints = 100;
	public String Name = "";
	
	
	
	
	public void hit() {
		Hitpoints = Hitpoints - 25;
		System.out.println("De unit genaamd " + Name + " heeft nog "
		 + Hitpoints + " aantal hitpoints.");
		
		if(Hitpoints == 0)
		{
			System.out.println("De unit genaamd " + Name + " is spijtig genoeg dood.");
		}
		return;
	}
}
