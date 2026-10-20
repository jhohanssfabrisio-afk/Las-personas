package Logica;
import java.util.Scanner;
public class Leer {
	private Scanner leer=new Scanner(System.in);
	public int leer_entero() {
		return leer.nextInt();
	}
	public String leer_String() {
		return leer.nextLine();
	}
	public Boolean leer_bool() {
		return leer.nextBoolean();
	}
}