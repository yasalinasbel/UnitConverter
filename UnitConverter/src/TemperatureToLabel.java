
public enum TemperatureToLabel {

	C_F ("C-F", "De Grados Celsius a Farenheit","Grados Celcius","Grados Farenheit"),
	C_K ("C-K", "De Grados Celsius a Kelvin","Grados Celcius","Grados Kelvin"),
	F_C ("F-C", "De Grados Farenheit a Celsius","Grados Farenheit","Grados Celcius"),
	F_K ("F-K", "De Grados Farenheit a Kelvin","Grados Farenheit","Grados Kelvin"),
	K_C ("K-C", "De Grados Kelvin a Celsius","Grados Kelvin","Grados Celsius"),
	K_F ("K-F", "De Grados Kelvin a Farenheit","Grados Kelvin","Grados Farenheit");
	
	
	String name;
	String label;
	String from;
	String to;
	
	private TemperatureToLabel(String name, String label,String from,String to) {
		this.name = name;
		this.label = label;
		this.from = from;
		this.to = to;
	}
	
	public static String getFinalMessageBy(String name) {
		
		for(TemperatureToLabel message:TemperatureToLabel.values()) {
			if (message.name.equals(name)) {	
				return message.to;
			}
		}
		return null;
	}

	public static String getInitalMessageBy(String name) {
		
		for(TemperatureToLabel message:TemperatureToLabel.values()) {
			if (message.name.equals(name)) {	
				return message.from;
			}
		}
		return null;
	}
	
	
	@Override
	public String toString() {
		return label;
	}
	
}
