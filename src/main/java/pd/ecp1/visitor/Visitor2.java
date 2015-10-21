package pd.ecp1.visitor;

public class Visitor2 extends Visitor{
	private int numElemA = 0;
	private int numElemB = 0;
	
    @Override
    public void visitElementA(ElementA e) {
        this.numElemA++;
    }

    @Override
    public void visitElementB(ElementB e) {
        this.numElemB++;
    }

	public int getAs() {
		return numElemA;
	}

	public int getBs() {
		return numElemB;
	}
    
}
