package pd.ecp1.state.connection;

public class Parado extends Estado {
	
	@Override
	public void iniciar(Conexion conexion){
    	conexion.setState(new Preparado());
    }
    
	@Override
    public void abrir(Conexion conexion){
		throw new UnsupportedOperationException("Acción no permitida... ");
    }
    
	@Override
    public void cerrar(Conexion conexion){
		throw new UnsupportedOperationException("Acción no permitida... ");
    }
    
	@Override
    public void parar(Conexion conexion){
    	//No se hace nada
		//Continua en el estado "parado"
    }
    
	@Override
    public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
    }
    
	@Override
    public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
    }
	
	@Override
	public String toString(){
		return "Parado";
	}
}
