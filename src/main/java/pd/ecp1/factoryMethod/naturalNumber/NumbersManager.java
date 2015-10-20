package pd.ecp1.factoryMethod.naturalNumber;

public class NumbersManager {
	private NaturalNumber number;
	
	private NumberCreator creator;
	
	public void setCreator(NumberCreator creator) {
        this.creator = creator;
    }
	
	public void createNumber(int value) {
        this.number = this.creator.createNumber(value);
    }
	
	public NaturalNumber getNumber() {
        return number;
    }
}
