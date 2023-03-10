package tarea4;

public class ImprimirRombos5_24 {

	public static void main(String[] args) {
		
		
		int cantida = 5;
	      
	      for (int a = 1; a <= cantida; a++) {
	         for (int b = 1; b <= cantida - a; b++) {
	            System.out.print(" ");
	         }
	         for (int c = 1; c <= 2 * a - 1; c++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
			      
	      for (int i = cantida - 1; i >= 1; i--) {
	         for (int j = 1; j <= cantida - i; j++) {
	            System.out.print(" ");
	         }
	         for (int k = 1; k <= 2 * i - 1; k++) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }

	}

}
