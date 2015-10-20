package pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber{
	private static final String[] textValues = {"zero", "one", "two", "three", "four", "five","six","seven","eight","nine"};
	
	public NaturalNumberEn(int value){
		super(value);
	}
	
	@Override
	public String getTextValue(){
		if (this.value < textValues.length) {
            return textValues[this.value];
        } else {
            return "???";
        }
	}
}
