package Bankrekening;

public class Bankrekening {
	double bedrag = 150;
//bedrag dat op de Bankrekening staat bekend maken
	
	public static void main(String args[]) {
		Bankrekening zichtrekeningING = new Bankrekening();
//instantie "zichtrekeningING" van klasse "Bankrekening" aanmaken
		System.out.println("Bedrag: " + zichtrekeningING.bedrag);
//output = Bedrag: bedrag van zichtrekeningING
	}
	
	public void addMoney(double money) {
		bedrag = bedrag + money;
//bedrag op Bankrekening = bedrag op zichtrekeningING + geld dat je bij op de rekening zet
	}
	
}
