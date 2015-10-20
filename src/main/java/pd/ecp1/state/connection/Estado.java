package pd.ecp1.state.connection;

public abstract class Estado {
	
	public abstract void iniciar(Conexion conexion);
	public abstract void abrir(Conexion conexion);
    public abstract void cerrar(Conexion conexion);    
    public abstract void parar(Conexion conexion);    
    public abstract void enviar(String msg);
    public abstract void recibir(int respuesta);
}
