import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class TemperatureConverterMenu implements ConverterMenu{
	
	private Converter converter;

	private TemperatureToLabel[] temperatureToLabel = TemperatureToLabel.values();
	
	public TemperatureConverterMenu() {
		this.converter = new Converter();
	}

	@Override
	public String requestValueToConvert() {
		
		boolean validation=true;
		String valueToConvert=null;
		double valueToConvertValidated;
		
		while(validation=true) {
			try {

				valueToConvert =(JOptionPane.showInputDialog(null,"Ingrese la temperatura a la que desea convertir: ","Input",
						JOptionPane.PLAIN_MESSAGE,null,null,"Selecciona")).toString();
				valueToConvertValidated=Double.parseDouble(valueToConvert);
				validation=false;
				break;
						
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Valor no válido");
				validation=true;
			}
		}
		return valueToConvert;
	}
		
	@Override
	public String selectConvertionType() {
		TemperatureToLabel temperatureSelected=(TemperatureToLabel)(JOptionPane.showInputDialog(null,"Elige una opción para convertir: ","Temperatura",
				JOptionPane.PLAIN_MESSAGE,null,temperatureToLabel,"Selecciona"));
		return temperatureSelected.name;
	}

	@Override
	public void convert(String valueToConvert, String conversionType) {
		String resultado=String.format("%.2f",converter.convertTemperature(conversionType, new BigDecimal(valueToConvert)));
		
		JOptionPane.showMessageDialog(null, valueToConvert+" "+ TemperatureToLabel.getInitalMessageBy(conversionType)+" son "+ resultado+" "+TemperatureToLabel.getFinalMessageBy(conversionType));	
	}
}
