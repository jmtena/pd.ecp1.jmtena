package pd.ecp1.factoryMethod.naturalNumber;

public class NumberCreatorEs extends NumberCreator{
	
	@Override
	public NaturalNumberEs createNumber(int value){
		return new NaturalNumberEs(value);
	}
}
