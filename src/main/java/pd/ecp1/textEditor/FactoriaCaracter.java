package pd.ecp1.textEditor;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	//Creación temprana
	private static final FactoriaCaracter factoriaCaracter = new FactoriaCaracter();
	
	private Map<Character,Caracter> map;
	
	private FactoriaCaracter(){
		this.map = new HashMap<>();
	}

	public static FactoriaCaracter getFactory(){
		return factoriaCaracter;
	}
	
	public Caracter getCaracter(char c){
		Character key = new Character(c);
		
		if (map.containsKey(key)){
			return map.get(key);
		}
		else{
			//Construcción perezosa
			Caracter cr = new Caracter(c);
			map.put(key,cr);
			return cr;
		}
	}
}
