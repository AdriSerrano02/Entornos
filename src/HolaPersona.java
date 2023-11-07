import java.util.Scanner;

public class HolaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String nombre;
		System.out.println("Introduce tu nombre");
		nombre = entrada.next();
		System.out.println("Hola "+nombre);
	}

}
