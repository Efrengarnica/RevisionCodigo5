import java.util.Scanner; //Importar 

public class Codigo5 {

	public static void main(String[] args) {  //Agregar
    Scanner s = new Scanner(System.in); //Agregar para que leea
    System.out.print("Introduzca un número: "); //Corregir comillas
    int ni = s.nextInt();  // Corergir tipo de dato leido
    int c = ni;
    
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
	  ni /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado."); //Arregar sintaxis
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    
  }
  
	}
}
