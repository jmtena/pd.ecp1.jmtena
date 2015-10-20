package pd.ecp1.state.connection;

public class Preparado extends Estado {
	
	@Override
	public void iniciar(Conexion conexion){
    	//No se hace nada
		//Continua en el estado Preparado
    }
    
	@Override
    public void abrir(Conexion conexion){
    	//No se hace nada
		//Continua en el estado Preparado
    }
    
	@Override
    public void cerrar(Conexion conexion){
    	conexion.setState(new Cerrado());
    }
    
	@Override
    public void parar(Conexion conexion){
    	conexion.setState(new Parado());
    }
    
	@Override
    public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
    	conexion.setState(new Esperando());
    }
    
	@Override
    public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
    }
	
	@Override
	public String toString(){
		return "Preparado";
	}
}
