package tarea4;

import java.util.Scanner;

public class CalcularVentas5_17 {

	public static void main(String[] args) {
		

		
		double p1 = 2.98, p2 = 4.50, p3 = 9.98, p4 = 4.49, p5 = 6.87;
		
		int numPro = 0;
		int CantVend = 0;
		double TotalVenta = 0;
		
		Scanner input = new Scanner(System.in);
	      
	      do {
	         System.out.print("\n\ncual es el numero del producto (1-5).3 \n"
	         		          + "1=2.98\n"
	         		          + "2=4.50\n"
	         		          + "3=9.98\n"
	         		          + "4=4.49\n"
	         		          + "5=6.89\n"
	         		          + ": ");
	         numPro = input.nextInt();
	         
	         if (numPro >= 1 && numPro <= 5) {
	            System.out.print("Introduzca la cantidad vendida: ");
	            CantVend = input.nextInt();
	            
	            switch (numPro) {
	               case 1:
	            	   TotalVenta += CantVend * p1;
	                  break;
	               case 2:
	            	   TotalVenta += CantVend * p2;
	                  break;
	               case 3:
	            	   TotalVenta += CantVend * p3;
	                  break;
	               case 4:
	            	   TotalVenta += CantVend * p4;
	                  break;
	               case 5:
	            	   TotalVenta += CantVend * p5;
	                  break;
	            }
	            
	            System.out.printf("El precio total de los productos vendidos es: $%.2f\n", TotalVenta);
	            
	         } else if (numPro != 0) {
	            System.out.println("Numero de producto invalido. Intente de nuevo.");
	         }
	      } while (numPro != 0);
	      
	 
	}

}
