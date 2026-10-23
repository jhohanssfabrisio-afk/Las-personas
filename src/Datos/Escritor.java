package Datos;
import java.io.*;
import java.util.Scanner;
import Logica.Persona;
public class Escritor {
	private String nombre_archivo="personas.txt";
	
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
			System.out.println("error en la creacion del archivo");
		}
	}
	public void guardar_dt(Persona persona){
		try {
			FileWriter write=new FileWriter(this.nombre_archivo);
			write.write(persona.getNombre());
			write.write(String.valueOf(persona.getHora()));
			write.write(String.valueOf(persona.getTramos()));
			write.write(persona.getDestino());
			
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erorr en la paertura del archivo");
			}
		finally {
		}
	}
}
