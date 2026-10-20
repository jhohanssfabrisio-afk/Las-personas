package Logica;

public class Encargo {
	private String hora;
	private int tiempo_minutos;
	private String Nombre;
	
	
	public Encargo(String hora, int tiempo_minutos, String nombre) {
		super();
		this.hora = hora;
		this.tiempo_minutos = tiempo_minutos;
		Nombre = nombre;
	}
	
	public Encargo() {
		super();
	}

	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getTiempo_minutos() {
		return tiempo_minutos;
	}
	public void setTiempo_minutos(int tiempo_minutos) {
		this.tiempo_minutos = tiempo_minutos;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public void crear_archivo() {
		Creador bin=new Creador("datos");
		
	}
}
