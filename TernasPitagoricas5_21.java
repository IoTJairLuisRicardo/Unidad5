package tarea4;

public class TernasPitagoricas5_21 {

	public static void main(String[] args) {


		int limiteDe = 500;
	      
		System.out.println("Triples de pitagoras (lado 1, lado 2, hipotenusa):");
      for (int lado1 = 1; lado1 <= limiteDe; lado1++) 
      {
    	  for (int lado2 = 1; lado2 <= limiteDe; lado2++) 
    	  {
    		  for (int hipotenusa = 1; hipotenusa <= limiteDe; hipotenusa++) 
    		    {
    			   if (lado1 * lado1 + lado2 * lado2 == hipotenusa * hipotenusa) 
    			     {
	                   System.out.printf("(%d, %d, %d)%n", lado1, lado2, hipotenusa);
    			  	 }
    		  	}
    	  	}
      	}
      
	}

}
