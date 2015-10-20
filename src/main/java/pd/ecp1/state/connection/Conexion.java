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
    	
    }
    
    public void abrir(){
    	
    }
    
    public void cerrar(){
    	
    }
    
    public void parar(){
    	
    }
    
    public void enviar(String msg) {
    	
    }
    
    public void recibir(int respuesta) {
    	
    }
    
    protected void setState(Estado state){
    	this.state = state;
    }
    
    public Link getLink() {
        return link;
    }
}
