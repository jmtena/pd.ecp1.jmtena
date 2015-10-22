package pd.ecp1.textEditor;

public abstract class Escrito extends Documento{
	protected java.util.List<Documento> list;
	
	public Escrito(){
		this.list = new java.util.ArrayList<Documento>();
	}
}
