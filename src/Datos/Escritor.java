package Datos;
import java.io.*;
import java.util.Scanner;
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
			File archivo=new File(this.nombre_archivo);
			FileWriter write=new FileWriter(this.nombre_archivo);
			Scanner scan=new Scanner(archivo);
			String variable;
			while(scan.hasNextLine()){
				variable=scan.nextLine();
				write.write(variable+"\n");
			}
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Erorr en la paertura del archivo");
			}
		
	}
}
