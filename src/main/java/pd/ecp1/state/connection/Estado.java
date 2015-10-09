package pd.ecp1.state.connection;

public abstract class Estado {
	
    public abstract void iniciar();
    public abstract void abrir();
    public abstract void cerrar();
    public abstract void parar();
    public abstract void enviar();
    public abstract void recibir();
}
