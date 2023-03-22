import javax.swing.JOptionPane;

public class Menu {
	
	private static String opciones[]= {"Conversor de Moneda","Conversor de Temperatura"};
	private static int selectContinue=0;
	
	public static void main(String[] args) {

		
		while (selectContinue==0) {
			ConverterMenu converterMenu = selectConverterMenu();
			
			String valueToConvert = converterMenu.requestValueToConvert();
				
			String conversionType = converterMenu.selectConvertionType();
			
			converterMenu.convert(valueToConvert, conversionType);
				
			selectContinue=JOptionPane.showConfirmDialog(null,"¿Desea continuar?");
					
		}
		JOptionPane.showConfirmDialog(null,"Programa terminado","Message",JOptionPane.DEFAULT_OPTION);
				
	}
	
	public static ConverterMenu selectConverterMenu() {
		String converterType = (JOptionPane.showInputDialog(null,"Seleccione una opción de conversión:","Menú",JOptionPane.PLAIN_MESSAGE,null,opciones,"Selecciona")).toString();
		if (converterType.equals("Conversor de Moneda")) {
			return new CurrencyConverterMenu();
		} else {
			return new TemperatureConverterMenu();
		}
	}
}
