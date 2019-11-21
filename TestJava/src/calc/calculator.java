package calc;

public class calculator {
	
	public static void main(String[] args) {
		calculator calc = new calculator();
		
		int resultaatPlus = calc.add(4, 8);
		System.out.println(resultaatPlus);
		
		double resultaatDelen = calc.divide(4, 8);
		System.out.println(resultaatDelen);
		
		int resultaatMaal = calc.multiply(4, 8);
		System.out.println(resultaatMaal);
		
		int resultaatMin = calc.substract(4, 8);
		System.out.println(resultaatMin);
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public double divide(double a, double b) {
		return a / b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int substract(int a, int b) {
		return a - b;
	}
}
