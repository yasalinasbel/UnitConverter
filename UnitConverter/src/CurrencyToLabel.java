
public enum CurrencyToLabel {
	
	USD_COP ("USD-COP", "De Dolares a Pesos","Pesos"),
	COP_USD ("COP-USD", "De Pesos a Dolares","Dolares"),
	EUR_COP ("EUR-COP", "De Euros a Pesos","Pesos"),
	COP_EUR ("COP-EUR", "De Pesos a Euros","Euros"),
	GBP_COP ("GBP-COP", "De Libras a Pesos","Pesos"),
	COP_GBP ("COP-GBP", "De Pesos a Libras","Libras"),
	KPW_COP ("KPW-COP", "De Won Coreano a Pesos","Pesos"),
	COP_KPW ("COP-KPW", "De Pesos a Won Coreano","Won Coreano"),
	JPY_COP ("JPY-COP", "De Yen a Pesos","Pesos"),
	COP_JPW ("COP-JPY", "De Pesos a Yen","Yen");
	
	String name;
	String label;
	String finalMessage;
	
	private CurrencyToLabel(String name, String label, String finalMessage) {
		this.name = name;
		this.label = label;
		this.finalMessage=finalMessage;
	}
	
	public static String getFinalMessageBy(String name) {
		
		for(CurrencyToLabel message:CurrencyToLabel.values()) {
			if (message.name.equals(name)) {	
				return message.finalMessage;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return label;
	}
	
}
