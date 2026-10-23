package Logica;
import Logica.Leer;

import java.io.Serializable;

import Datos.Escritor;
public class Persona implements Serializable{
	private String nombre;
	private int hora;
	private int tramos;
	private String destino;
	
	public Persona() {
		super();
	}
	public Persona(String nombre, int hora, int tramos, String destino) {
		super();
		this.nombre = nombre;
		this.hora = hora;
		this.tramos = tramos;
		this.destino = destino;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getTramos() {
		return tramos;
	}
	public void setTramos(int tramos) {
		this.tramos = tramos;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void crear() {
		Leer leer=new Leer();
		System.out.println("Ingresa tu nombre:");
		this.nombre=leer.leer_String();
		System.out.println("Ingresa tu hora:");
		this.hora=leer.leer_entero();
		System.out.println("Ingresa tu tramo:");
		this.tramos=leer.leer_entero();
		leer.leer_String();
		System.out.println("Ingresa tu destino:");
		this.destino=leer.leer_String();
	}
	public void dar_informacion() {
		
	}
	public void guardar() {
		Escritor escribir=new Escritor();
		escribir.guardar_dt(this);
	}
	public void crear_bin() {
		
	}
	//
}
