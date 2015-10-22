package pd.ecp1.textEditor;

public abstract class Documento {
	public abstract void addCaracter(Caracter c);
	public abstract void addParrafo(Parrafo p);
	public abstract void addTexto(Texto txt);
	
	public abstract void removeCaracter(Caracter c);
	public abstract void remove(Parrafo p);
	public abstract void remove(Texto txt);
	
	public abstract String print(boolean upperCase);
}
