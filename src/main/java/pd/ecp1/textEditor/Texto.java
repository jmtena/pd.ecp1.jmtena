package pd.ecp1.textEditor;

public class Texto extends Escrito{
	
	@Override
	public void addParrafo(Parrafo p){
		list.add(p);
	}
	
	@Override
	public void addTexto(Texto txt){
		list.add(txt);
	}
	
	@Override
	public void addCaracter(Caracter c){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	@Override
	public void remove(Parrafo p){
		list.remove(p);
	}
	
	@Override
	public void remove(Texto txt){
		list.remove(txt);
	}
	
	@Override
	public void removeCaracter(Caracter c){} //No se hace nada. Se ignora
	
	@Override
	public String print(boolean upperCase){
		String texto = "";
		
		for(Documento doc : list)
			texto += doc.print(upperCase);
		
		texto += "\n";
		texto += "---o---";
		
		return texto;
	}
}
