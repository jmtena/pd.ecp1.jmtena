package pd.ecp1.textEditor;

public class Parrafo extends Escrito{
	
	@Override
	public void addCaracter(Caracter c){
		list.add(c);
	}
	
	@Override
	public void removeCaracter(Caracter c){
		list.remove(c);
	}
	
	@Override
	public void addParrafo(Parrafo p){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	@Override
	public void addTexto(Texto txt){
		throw new UnsupportedOperationException("Acción no permitida... ");
	}
	
	@Override
	public void remove(Parrafo p){} //No se hace nada. Se ignora
	
	@Override
	public void remove(Texto txt){} //No se hace nada. Se ignora
	
	@Override
	public String print(boolean upperCase){
		String parrafo = "";
		
		for(Documento doc : list)
				parrafo += doc.print(upperCase);
		
		parrafo += "\n";
		
		return parrafo;
	}
}
