package pe.edu.upeu.sysVentas.entity;

public class Producto {
	private int idproducto;
	private String nomprod;
	private int precio;
	private int cantidad;
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(int idproducto, String nomprod, int precio, int cantidad) {
		super();
		this.idproducto = idproducto;
		this.nomprod = nomprod;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
