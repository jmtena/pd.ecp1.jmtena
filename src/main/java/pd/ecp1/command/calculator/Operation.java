package pd.ecp1.command.calculator;

public abstract class Operation implements Command{
	public abstract void execute();
    public abstract String name();
}
