package pd.ecp1.factoryMethod.naturalNumber;

public class NumberCreatorEn extends NumberCreator {
	
	@Override
	public NaturalNumberEn createNumber(int value){
		return new NaturalNumberEn(value);
	}
}
