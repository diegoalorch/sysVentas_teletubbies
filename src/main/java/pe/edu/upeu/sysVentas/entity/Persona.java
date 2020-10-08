package pe.edu.upeu.sysVentas.entity;

public class Persona {
	private int idpersona;
	private String nombre;
	private String apellidos;
	private int Dni;
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(int idpersona, String nombre, String apellidos, int dni) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		Dni = dni;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	
}
