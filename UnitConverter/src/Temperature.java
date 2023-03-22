import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Temperature {
	
	private Map<String, BigDecimal> relationsTemperature = new HashMap<>(); 

	public Temperature () {
		MathContext mc=new MathContext(10,RoundingMode.HALF_UP);
		
		BigDecimal cToF = new BigDecimal("9").divide(new BigDecimal("5"),mc);
		relationsTemperature.put("C-F",cToF );
		BigDecimal fToC = new BigDecimal("5").divide(new BigDecimal("9"),mc);
		relationsTemperature.put("F-C", fToC);
		
		BigDecimal cToK = new BigDecimal("273.15");
		relationsTemperature.put("C-K",cToK );
		BigDecimal kToC = new BigDecimal("273.15");
		relationsTemperature.put("K-C",kToC );
		
		BigDecimal kToF = new BigDecimal("9").divide(new BigDecimal("5"),mc);
		relationsTemperature.put("K-F",kToF );
		BigDecimal fTok = new BigDecimal("5").divide(new BigDecimal("9"),mc);
		relationsTemperature.put("F-K",fTok);
		
	}
	public BigDecimal getValue(String fromto) {
		return relationsTemperature.get(fromto);	
	}
	public BigDecimal getValueCtoF (String fromto,BigDecimal valueToConvert) {
		
		return (getValue(fromto).multiply(valueToConvert)).add(new BigDecimal("32"));
	}
	public BigDecimal getValueFtoC (String fromto,BigDecimal valueToConvert) {
		return getValue(fromto).multiply(valueToConvert.subtract(new BigDecimal("32")));
	}
	public BigDecimal getValueCtoK (String fromto,BigDecimal valueToConvert) {
		return valueToConvert.add(getValue(fromto));
	}
	public BigDecimal getValueKtoC (String fromto,BigDecimal valueToConvert) {
		return valueToConvert.subtract(getValue(fromto));
	}
	public BigDecimal getValueKtoF (String fromto,BigDecimal valueToConvert) {
		return (getValue(fromto).multiply(valueToConvert.subtract(new BigDecimal("273.15")))).add(new BigDecimal("32"));
	}
	public BigDecimal getValueFtoK (String fromto,BigDecimal valueToConvert) {
		return (getValue(fromto).multiply(valueToConvert.add(new BigDecimal("459.67"))));

	}
	
	
	
	
	}


