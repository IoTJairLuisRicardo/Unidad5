package tarea4;

import java.util.Scanner;

public class ExamenCalentamientoGlobal5_31 {

	public static void main(String[] args) 
	{

		System.out.println("EXAMEN RAPIDO SOBRE EL CALENTAMIENTO BLOBAL");
		
		String[] preguntas = {
                "PREGUNTA 1. ¿Que puede causar el calentamiento global?",
                "PREGUNTA 2. ¿Cuanto tarda el dioxido de carbono en desaparecer de la atmosfera?",
                "PREGUNTA 3. ¿Cual de los siguientes gases no atrapa el calor?",
                "PREGUNTA 4. ¿Quese puede hacer para recucir el calentamiento global?",
                "PREGUNTA 5. ¿Cual de los siguientes es un efecto del calentamiento global?"
        };
        String[][] opciones = { {"1.A) volcanes.", "2.B)Fuegos artificiales.", "3.C)Tirar basura.", "4.D)Todas las anteriores."},
                                {"1.A)50 años.", "2.B)115 años.", "3.C)Nunca desaparece.", "D)100 años."},
                {"1.A)Oxido de carbono.", "2.B)Ninguno.", "3.C)Agua de vapor.", "4.D)Hidrogeno."},
                {"A)Ahorrar agua.", "B)No tirar basura.", "C)Reducir el costo de energia.", "4.D)Todas las anteriores."},
                {"1.A)aumento de agua.", "2.B)Mas consumo de energia.", "3.C)Hace mas frio.", "4.D)Perdida de glasiare."}
        };
        int[] respuestas = {4, 4, 4, 4, 4};

        int correctas = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println( preguntas[i]);
            for (int j = 0; j < opciones[i].length; j++) {
	                System.out.println( opciones[i][j]);
            }
            int respuesta = scanner.nextInt();
            if (respuesta == respuestas[i]) {
                correctas++;
            }
        }

        System.out.println("Ha respondido correctamente a " + correctas + " de las 5 preguntas.");
        if (correctas == 5) {
            System.out.println("Excelente");
        } else if (correctas == 4) {
            System.out.println("Muy bien");
        } else {
            System.out.print("\nEs tiempo de aprender más sobre el calentamiento global.\n");
            System.out.println("Algunos sitios web útiles para aprender más son:\n//https://www.fundacionaquae.org/cuanto-sabes-de-calentamiento-global-2/\r\n"
            		+ "\nhttps://www.ecologiaverde.com/calentamiento-global-definicion-causas-y-consecuencias-1095.html");
        }
		
	}

}
