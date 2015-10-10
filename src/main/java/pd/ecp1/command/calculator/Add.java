package pd.ecp1.command.calculator;

public class Add extends Operation{
	private Calculator calculator;
	
	public Add(Calculator calculator){
		this.calculator = calculator;
	}
	
    @Override
    public String name() {
        return "Add";
    }

    @Override
    public void execute() {
        this.calculator.add();
    }
	
}
