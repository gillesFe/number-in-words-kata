package kata;

import java.util.HashMap;
import java.util.Map;

public class NumberInWords {
	
	private static final String COMPLEX_SEPARATOR = " ET ";

	private static final String SIMPLE_SEPARATOR = " ";

	private static Map<String, String> units = new HashMap<>();
	
	private static Map<String, String> decades = new HashMap<>();
	
	private static Map<String, String> hundreds = new HashMap<>();
	
	private final String numberConvertedInWords;
	
	static {
		units.put("1", "UN");
		units.put("2", "DEUX");
		units.put("3", "TROIS");
		units.put("4", "QUATRE");
		units.put("5", "CINQ");
		units.put("6", "SIX");
		units.put("7", "SEPT");
		units.put("8", "HUIT");
		units.put("9", "NEUF");
		units.put("10", "DIX");
		units.put("11", "ONZE");
		units.put("12", "DOUZE");
		units.put("13", "TREIZE");
		units.put("14", "QUATORZE");
		units.put("15", "QUINZE");
		units.put("16", "SEIZE");
		units.put("17", "DIX SEPT");
		units.put("18", "DIX HUIT");
		units.put("19", "DIX NEUF");
	}
	
	static {
		decades.put("20", "VINGT");
		decades.put("30", "TRENTE");
		decades.put("40", "QUARANTE");
		decades.put("50", "CINQUANTE");
		decades.put("60", "SOIXANTE");
		decades.put("70", "SOIXANTE DIX");
		decades.put("80", "QUATRE VINGT");
		decades.put("90", "QUATRE VINGT DIX");
	}
	
	static {
		hundreds.put("100", "CENT");
		hundreds.put("200", "DEUX CENT");
		hundreds.put("300", "TROIS CENT");
		hundreds.put("400", "QUATRE CENT");
		hundreds.put("500", "CINQ CENT");
		hundreds.put("600", "SIX CENT");
		hundreds.put("700", "SEPT CENT");
		hundreds.put("800", "HUIT CENT");
		hundreds.put("900", "NEUF CENT");
	}
	
	private NumberInWords(String numberInWords) {
		this.numberConvertedInWords = numberInWords;
	}

	public static NumberInWords from(int number) {
		return new NumberInWords(convertInWords(number));
	}
	
	public String get() {
		return numberConvertedInWords;
	}
	
	private static String convertInWords(int number) {
		String inputNumber = String.valueOf(number);
		
		if (isHundreds(inputNumber)) {
			return hundreds.get(inputNumber);
		}
		
		if (isCompositeHundreds(inputNumber)) {
			return buildCompositeHundreds(inputNumber);
		}
		
		if (isDecades(inputNumber)) {
			return decades.get(inputNumber);
		}
		
		if (isCompositeDecades(inputNumber)) {
			return buildCompositeDecades(inputNumber);
		}
		
		return units.get(inputNumber);
	}

	private static boolean isHundreds(String inputNumber) {
		return hundreds.containsKey(inputNumber);
	}

	private static String buildCompositeDecades(String inputNumber) {
		String decade = String.valueOf(inputNumber.charAt(0));
		String unit = String.valueOf(inputNumber.charAt(1));
		
		return decades.get(decade + "0") + buildSeparator(unit) + units.get(unit);
	}
	
	private static String buildCompositeHundreds(String inputNumber) {
		String hundred = String.valueOf(inputNumber.charAt(0));
		String decade = String.valueOf(inputNumber.charAt(1));
		String unit = String.valueOf(inputNumber.charAt(2));
		
		if (decades.containsKey(decade + unit)) {
			return buildHundredWith(hundred) + buildSeparator(decade + unit) + decades.get(decade + unit);
		}
		
		if (units.containsKey(decade + unit)) {
			return buildHundredWith(hundred) + buildSeparator(decade + unit) + units.get(decade + unit);
		}
		
		return buildHundredWith(hundred) + SIMPLE_SEPARATOR + decades.get(decade + "0") + buildSeparator(unit) + units.get(unit);
	}

	private static String buildHundredWith(String hundred) {
		return hundreds.get(hundred + "00");
	}

	private static String buildSeparator(String number) {
		if (isCompositeDecades(number)) {
			return SIMPLE_SEPARATOR;
		}
		
		if (number.equals("1")) {
			return COMPLEX_SEPARATOR;
		}
		
		return SIMPLE_SEPARATOR;
	}

	private static boolean isCompositeDecades(String inputNumber) {
		return inputNumber.length() == 2 && !inputNumber.startsWith("1");
	}
	
	private static boolean isCompositeHundreds(String inputNumber) {
		return inputNumber.length() == 3;
	}

	private static boolean isDecades(String inputNumber) {
		return decades.containsKey(inputNumber);
	}

}
