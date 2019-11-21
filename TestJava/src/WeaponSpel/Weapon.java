package WeaponSpel;

public class Weapon {
	public String name = "";
	public int magazincapacity = 30;
	
	public void fire() {
		magazincapacity = magazincapacity - 1;
		System.out.println("weapon "+ name + ": magazincapacity = " + magazincapacity + " ruben is ne kleine schele chinees");
	}
}
