package PuntoCuatroCincoSeis;

public class PuntoCuatroCincoSeis {
	public PuntoCuatroCincoSeis () {
		Estudiante [] estudiantes = new Estudiante [3];
		
		estudiantes [1] = new Estudiante ("Mary Jones", 14, 46);
		estudiantes [2] = new Estudiante ("John Stiner", 60, 173);
		estudiantes [3] = new Estudiante ("Ari Samala", 31, 69);
		
		
		int creditos = estudiantes [2].getCreditos();
		int PuntosdeCalidad = estudiantes [2].getPuntosdeCalidad();
		estudiantes [2]. setCreditos (creditos + 3);
		estudiantes [2]. setPuntosdeCalidad (PuntosdeCalidad + 52);
		
		
		estudiantes [2]. inputCreditosyPuntosdeCalidad ();
		
	}

}
