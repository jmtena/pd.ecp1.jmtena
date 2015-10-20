package pd.ecp1.state.connection;

public class Conexion {
    private Estado state;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setState(new Cerrado());
    }

    public void iniciar(){
    	state.iniciar(this);
    }
    
    public void abrir(){
    	state.abrir(this);
    }
    
    public void cerrar(){
    	state.cerrar(this);
    }
    
    public void parar(){
    	state.parar(this);
    }
    
    public void enviar(String msg) {
    	state.enviar(this,msg);
    }
    
    public void recibir(int respuesta) {
    	state.recibir(this,respuesta);
    }
    
    protected void setState(Estado state){
    	this.state = state;
    }
    
    public Estado getState() {
		return state;
	}

	public Link getLink() {
        return link;
    }
}
