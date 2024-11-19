package System;


/**
 * @version 1.0
 * @created 19-nov.-2024 3:52:40 p. m.
 */
public class Credenciales {

	private String idCredenciales;
	private String tipo;
	private long estado;
	private int fechaExpiracion;
	public Lectores m_Lectores;

	public Credenciales(){

	}

	public void finalize() throws Throwable {

	}

	public int validarCredencial(){
		return 0;
	}

}