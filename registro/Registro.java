package registro;
import java.util.Scanner;
public class Registro {

public int año, fechaPrestamo;
public String nombre, autor, carne, carrera;
public String titulo;
public String sexo;

Scanner tc = new Scanner(System.in);

public Registro(String titulo, int año, int fechaPrestamo, String nombre, String autor, String carne, String carrera, String sexo) {
	super();
	this.año = año;
	this.fechaPrestamo = fechaPrestamo;
	this.nombre = nombre;
	this.autor = autor;
	this.carne = carne;
	this.carrera = carrera;
	this.sexo = sexo;
	this.titulo = titulo;
}


public void nombreLibro() {
	System.out.println("Ingrese el nombre del libro");
	titulo = tc.nextLine();
}

public String nombre() {
	return nombre;
}

public void autorLibro() {
	System.out.println("Ingrese el autor del libro");
	autor = tc.nextLine();
}

public String autor() {
	return autor;
}

public void añoLibro() {
	System.out.println("Ingrese el año del libro");
	año = tc.nextInt();
	 tc.nextLine();
}

public int año() {
	return año;
}

public void fechaPrestamo() {
	System.out.println("Ingrese la fecha de prestamo");
	fechaPrestamo = tc.nextInt();
	 tc.nextLine();
}

public int fecha() {
	return fechaPrestamo;
}

public void sexoPrestamo(){
	System.out.println("Ingrese su Sexo");
	sexo = tc.nextLine();
}

public String sexo() {
	return sexo;
}





}
