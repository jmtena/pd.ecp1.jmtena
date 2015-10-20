package pd.ecp1.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber{
	private static final String[] textValues = {"cero", "uno", "dos", "tres", "cuatro", "cinco","seis","siete","ocho","nueve"};
	
	public NaturalNumberEs(int value){
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
