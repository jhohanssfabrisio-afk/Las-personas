package Datos;
import java.io.*;

import Logica.Persona;
public class Escritor {
	private String nombre_archivo="personas";
	
	public Escritor() {
	}

	public Escritor(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}

	public void crear(){
		File file=new File(this.nombre_archivo);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void guardar(Persona persona){
		try {
			FileWriter write=new FileWriter(this.nombre_archivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
