package lernen_informatik.lernen_informatik;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class IstPrimZahl {

	   public static void main (String args[]) throws Exception {

	      BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
	      int n;
	      boolean isprim;

	      // Eingabe

	      System.out.print ("Geben Sie eine natürliche Zahl n ein ");
	      n = Integer.parseInt(eingabe.readLine());

	      // eigentliche Berechnung

	      if (n == 1) {
	         isprim = false;
	      }
	      else {
	         isprim = true;
	         for (int i = 2; i <= Math.sqrt(n); i++) {// kann man auch auf die methode verzichten? und das irgentwie anders mit ner for schleife machen?

	            //Testet, ob n modulo i gleich 0 ist (d.h. ob i die Zahl n teilt)

	            if (n % i == 0) {
	               isprim = false;
	               break;
	            }
	         }
	      }

	      // Ausgabe
	 if (isprim == true) 
	      System.out.print("Die Zahl " + n + " ist eine Primzahl ");
	   else
          System.out.println(" Die Zahl  "+n+   " ist keine Primzahl");
	     }
	   }
