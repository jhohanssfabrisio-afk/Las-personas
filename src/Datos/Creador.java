package Datos;

import java.io.File;

public class Creador {
	private String referencia="datos.txt";
	public void crearArchivo() {
		File file=new File(this.referencia);
	}
}
