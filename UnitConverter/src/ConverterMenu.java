
public interface ConverterMenu {
	
	String requestValueToConvert();
	
	String selectConvertionType();
	
	void convert(String valueToConvert, String conversionType);

}
