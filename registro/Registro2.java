package registro;
import java.util.Scanner;
public class Registro2 extends Registro{
	Object [][] arr;
	Scanner tc = new Scanner(System.in);
	
	
	public Registro2(String titulo, int año, int fechaPrestamo, String nombre, String autor, String carne,
			String carrera, String sexo) {
		super(titulo, año, fechaPrestamo, nombre, autor, carne, carrera, sexo);
	
	}

	 public void leerDatos() {
	        nombreLibro();
	        autorLibro();
	        añoLibro();
	        fechaPrestamo();
	        sexoPrestamo();
	        leerCarne();
	    }
	
public void leerNombre() {
	System.out.println("Ingrese su nombre");
nombre = tc.nextLine();

}
public String name() {
	return titulo;
}

public void leerCarne() {
	System.out.println("Ingrese su numero de carne");
carne = tc.nextLine();

}

public String Carne() {
return carne;
}

public void imprimirfactura() {
	Object [][] arr = new Object[][] {
		{"Título: ", titulo, "autor: ", autor ,"Año: ", año},
		{"Nombre: ", nombre, "Sexo: ", sexo, "Carné: ", carne},
		{"Fecha: ", fechaPrestamo}
	};
	
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr[i].length; j++) {
	        System.out.print(arr[i][j] + " ");
	    }
	    System.out.println();
	}
	
}

public Object factura(){
	return arr;
	
}

public static void main(String[] args) {
    Registro2 registro2 = new Registro2("", 0, 0, "", "", "", "", "");
    registro2.leerDatos();
    registro2.imprimirfactura();
}

}
