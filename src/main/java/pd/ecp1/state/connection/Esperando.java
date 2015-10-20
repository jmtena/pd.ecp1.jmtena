package pd.ecp1.state.connection;

public class Esperando extends Estado {
	
	@Override
	public void iniciar(Conexion conexion){
		throw new UnsupportedOperationException("Acción no permitida... ");
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
		throw new UnsupportedOperationException("Acción no permitida... ");
    }
    
	@Override
    public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
    }
    
	@Override
    public void recibir(Conexion conexion, int respuesta) {
    	if (respuesta==0)
    		conexion.setState(new Preparado());
    	else
    		conexion.setState(new Cerrado());
    }
	
	@Override
	public String toString(){
		return "Esperando";
	}
}
