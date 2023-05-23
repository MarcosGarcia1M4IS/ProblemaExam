package registro;
import java.util.Scanner;
public class Registro_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Scanner tc = new Scanner(System.in);
	Registro op = new Registro(null, 0, 0, null, null, null, null, null);
	Registro2 a = new Registro2(null, 0, 0, null, null, null, null, null);
int po = 0;	
	
	
	
	while(po!=3) {
		System.out.println("Ingrese la opción que desea");
		System.out.println("1. Prestar libro");
		System.out.println("2. Regresar libro");
		System.out.println("3. Salir");
		po = tc.nextInt();
			
		switch(po) {
		case 1:
			op.nombreLibro();
			op.autorLibro();
			op.añoLibro();
			op.fechaPrestamo();
			a.leerNombre();
			a.leerCarne();
			op.sexoPrestamo();
			a.imprimirfactura();
			break;
		case 2: 
			a.leerCarne();
			System.out.println(a.carne + " Ha devuelto el libro");
		break;

		case 3:
			System.out.println("Saliendo...");
			break;

		}
	}

	}catch(java.util.InputMismatchException a) {
		System.out.println("Error");
	}
	
	}
	
}
