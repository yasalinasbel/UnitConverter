import java.math.BigDecimal;

public class Converter {
	
	private Currency currency;
	private Temperature temperature;
	
	public Converter() {
		this.currency = new Currency();
		this.temperature = new Temperature();
	}
	

	public double convertCurrency(String fromto, double valueToConvert) {
	
		double value = currency.getValue(fromto);
		return value * valueToConvert;
	}
	
	public BigDecimal convertTemperature(String fromto, BigDecimal valueToConvert) {
		if (fromto.equals("C-F")) {
			BigDecimal value = temperature.getValueCtoF(fromto, valueToConvert);
			return value;
		} else if(fromto.equals("F-C")){
			BigDecimal value = temperature.getValueFtoC(fromto, valueToConvert);
			return value;	
		}else if(fromto.equals("C-K")){
			BigDecimal value = temperature.getValueCtoK(fromto, valueToConvert);
			return value;
		}else if(fromto.equals("K-C")){
			BigDecimal value = temperature.getValueKtoC(fromto, valueToConvert);
			return value;
		}else if(fromto.equals("K-F")){
			BigDecimal value = temperature.getValueKtoF(fromto, valueToConvert);
			return value;
		}else if(fromto.equals("F-K")){
			BigDecimal value = temperature.getValueFtoK(fromto, valueToConvert);
			return value;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Converter converter = new Converter();
		
		double cops = converter.convertCurrency("COP-GBP", 5709.0);
	/*	double temp = converter.convertTemperature("K-F", 120);*/
		
		System.out.println("cops: " + cops);
		/*System.out.println("temp: " + temp);*/
	}
	
	
}
