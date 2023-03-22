import java.util.HashMap;
import java.util.Map;

public class Currency {
	
	private Map<String, Double> relations = new HashMap<>(); 
	
	public Currency () {
		double usdToCop = 4685.07;
		relations.put("USD-COP", usdToCop);
		double copToUsd = 1/usdToCop;
		relations.put("COP-USD", copToUsd);
		
		double eurToCop = 5026.59;
		relations.put("EUR-COP", eurToCop);
		double copToEur = 1/eurToCop;
		relations.put("COP-EUR", copToEur);
		
		double gbpToCop= 5708.84;
		relations.put("GBP-COP", gbpToCop);
		double copTogbp = 1/gbpToCop;//libra
		relations.put("COP-GBP", copTogbp);
		
		double kpwToCop= 5.21;//won
		relations.put("KPW-COP", kpwToCop);
		double copTokpw = 1/kpwToCop;
		relations.put("COP-KPW", copTokpw);
		
		double jpyToCop=35.13 ;//YEN
		relations.put("JPY-COP", jpyToCop);
		double copTojpy = 1/jpyToCop;
		relations.put("COP-JPY", copTojpy);
		
		
	}
	public double getValue(String fromto) {
		return relations.get(fromto);	
	}
	

}
