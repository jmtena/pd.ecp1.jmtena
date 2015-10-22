package pd.ecp1.textEditor;

public class Caracter extends Documento{
	private char caracter;
	
	public Caracter(char caracter){
		this.caracter = caracter;
	}
	
	@Override
	public String print(boolean upperCase){
		if (upperCase)
			return new String(this.caracter + "").toUpperCase();
		else
			return this.caracter + "";
	}
	
	@Override
	public void addCaracter(Caracter c){} //No se hace nada. Se ignora
	
	@Override
	public void addParrafo(Parrafo p){} //No se hace nada. Se ignora
	
	@Override
	public void addTexto(Texto txt){} //No se hace nada. Se ignora
	
	@Override
	public void removeCaracter(Caracter c){} //No se hace nada. Se ignora
	
	@Override
	public void remove(Parrafo p){} //No se hace nada. Se ignora
	
	@Override
	public void remove(Texto txt){} //No se hace nada. Se ignora
}
