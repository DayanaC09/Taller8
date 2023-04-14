package PuntoCuatroCincoSeis;

import java.util.Scanner;

public class Estudiante {
	private Scanner sc = new Scanner(System.in);
	
	String nombre = "";
	int creditos = 0;
	float PromediodeCalificaciones = 0.0f ;
	int PuntosdeCalidad = 0;
	
	Estudiante (String nombre, int creditos, int PuntosdeCalidad) {
		setNombre (nombre);
		setCreditos (creditos);
		setPuntosdeCalidad (PuntosdeCalidad);
		
		updatePromediodeCalificaciones ();
	}
	
	public void inputCreditosyPuntosdeCalidad() {
		
		System.out.println("Ingrese el numero de creditos para este curso: ");
		int creditos = sc.nextInt();
		setCreditos(creditos);
		
		System.out.println("Ingrese los puntos de calidad para este curso: ");
		int PuntosdeCalidad = sc.nextInt();
		setPuntosdeCalidad(PuntosdeCalidad);
		
		updatePromediodeCalificaciones();
	}
	
	private void updatePromediodeCalificaciones() {
		setPromediodeCalificaciones(getPuntosdeCalidad() / getCreditos());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public float getPromediodeCalificaiones() {
		updatePromediodeCalificaciones();
		return PromediodeCalificaciones;
	}
	public void setPromediodeCalificaciones(float PromediodeCalificaciones) {
		this.PromediodeCalificaciones = PromediodeCalificaciones;
	}
	public int getPuntosdeCalidad() {
		return PuntosdeCalidad;
	}
	public void setPuntosdeCalidad(int PuntosdeCalidad) {
		this.PuntosdeCalidad = PuntosdeCalidad;
	}

}
