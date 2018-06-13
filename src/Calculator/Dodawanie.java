package Calculator;

public class Dodawanie implements Calculable {

	@Override
	public String calculate(String a, String b) {
		Integer wynik= Integer.parseInt(a)+Integer.parseInt(b);
		return wynik.toString();
	}

}
 class Odejmowanie implements Calculable {

	@Override
	public String calculate(String a, String b) {
		Integer wynik= Integer.parseInt(a)-Integer.parseInt(b);
		
		return wynik.toString();
	}

}
 class Mnozenie implements Calculable {

	@Override
	public String calculate(String a, String b) {
		Integer wynik= Integer.parseInt(a)*Integer.parseInt(b);
		
		return wynik.toString();
	}

}
 class Dzielenie implements Calculable {

	@Override
	public String calculate(String a, String b) {
		Integer wynik= Integer.parseInt(a)/Integer.parseInt(b);
		
		return wynik.toString();
	}

}


