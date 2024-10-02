import java.util.Scanner; //Importar 

public class Codigo5 {
	
	
	
	//Este programa recibe cualquier numero entero y si el numero entero tiene varios digitos va a contabilizar los 
	// digitos que son afortunados y los que NO y al final si hay más digitos afortunados que NO afortunados se considerara un numero
	//afortunado
	//Al parecer se busca que el usuario ingrese un numero y dependiendo del codigo de abajo se decide si el numero es 
	// afortunado o no, lo interesante aqui es que se ocupa ni /= 10; para hacer que la variable decremente.
	
	

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
    }
      //Se sacó del else para que termine el ciclo
      ni /= 10;  // Esto hace que se acabe el while ya que como ni es entero cuando ni sea un numero decimal le quita la parte decimal
      }//while se cierra aqui NO tiene sentido que se cierre mas abajo
    if (afo > noAfo) {// Se sacaron los if del while 
      System.out.println("El " + c + " es un número afortunado."); //Arregar sintaxis
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    s.close();// Se cierra el System.in 
  
	}// main 
}// class Codigo5

