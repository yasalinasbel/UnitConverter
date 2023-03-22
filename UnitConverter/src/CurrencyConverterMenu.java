
import javax.swing.JOptionPane;

public class CurrencyConverterMenu implements ConverterMenu {
	
	private Converter converter;
		
	private CurrencyToLabel[] currencyToLabel = CurrencyToLabel.values();
	
	public CurrencyConverterMenu() {
		this.converter = new Converter();

	}

	@Override
	public String requestValueToConvert() {
		String valueToConvert = null;
		boolean invalidValue = true;
		while (invalidValue) {
			valueToConvert = (JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir: ","Input",JOptionPane.PLAIN_MESSAGE,null,null,"Selecciona")).toString();
			if (valueToConvert.matches("^-?\\d+(?:\\.\\d+)?$")) {
				invalidValue=false;
				return valueToConvert;
			} else {
				JOptionPane.showMessageDialog(null, "Valor no válido");
				invalidValue=true;
			}
		}
		return null;	
	}
	@Override
	public String selectConvertionType() {
		CurrencyToLabel currencySelected=(CurrencyToLabel) (JOptionPane.showInputDialog(null,"ELige la moneda a la que deseas convertir tu dinero: ","Monedas",
				JOptionPane.PLAIN_MESSAGE,null,currencyToLabel,"Selecciona"));
		return currencySelected.name;
	}

	@Override
	public void convert(String valueToConvert, String conversionType) {
		String resultado=String.format("%.2f",converter.convertCurrency(conversionType, Double.parseDouble(valueToConvert)));	
		JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" "+ CurrencyToLabel.getFinalMessageBy(conversionType));
	}

}
