package Calculator;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
	HashMap<String,Calculable> map= new HashMap<String,Calculable>();
	String doCalc(String a) {
		map.put("+", new Dodawanie());
		map.put("-", new Odejmowanie());
		map.put("*", new Mnozenie());
		map.put("/", new Dzielenie());
		
		Pattern p= Pattern.compile("(\\d+) ([\\+\\*-/]) (\\d+)");
		Matcher matcher=p.matcher(a);
		matcher.matches();
		
		return map.get(matcher.group(2)).calculate(matcher.group(1), matcher.group(3));
	}
}
