package db;

public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;

//	Enviar as mensagens de exceção para a superclasse
	public DbException (String msg) {
		super(msg);
	}
}
