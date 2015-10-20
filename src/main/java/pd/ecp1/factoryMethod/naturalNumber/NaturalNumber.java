package pd.ecp1.factoryMethod.naturalNumber;

public abstract class NaturalNumber {
	protected int value;
	
	public abstract String getTextValue();
	
	public NaturalNumber(int value){
		this.setValue(value);
	}
	
	protected int getValue(){
		return value;
	}
	
	protected void setValue(int value){
		this.value = value;
	}
	
	protected void add(int value){
		this.setValue(this.value + value);
	}
}
