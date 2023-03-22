
import javax.swing.JOptionPane;

public class CurrencyConverterMenu implements ConverterMenu {
	
	private Converter converter;
		
	private CurrencyToLabel[] currencyToLabel = CurrencyToLabel.values();
	
	public CurrencyConverterMenu() {
		this.converter = new Converter();

	}

	@Override
	public String requestValueToConvert() {
		boolean validation=true;
		String valueToConvert=null;
		double valueToConvertValidated;
		
		while(validation=true) {
			try {

				valueToConvert =(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir: ","Input",JOptionPane.PLAIN_MESSAGE,null,null,"Selecciona")).toString();
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
		CurrencyToLabel currencySelected=(CurrencyToLabel) (JOptionPane.showInputDialog(null,"Elige la moneda a la que deseas convertir tu dinero: ","Monedas",
				JOptionPane.PLAIN_MESSAGE,null,currencyToLabel,"Selecciona"));
		return currencySelected.name;
	}

	@Override
	public void convert(String valueToConvert, String conversionType) {
		String resultado=String.format("%.2f",converter.convertCurrency(conversionType, Double.parseDouble(valueToConvert)));	
		JOptionPane.showMessageDialog(null, "Tienes $ "+resultado+" "+ CurrencyToLabel.getFinalMessageBy(conversionType));
	}

}
