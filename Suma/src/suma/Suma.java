public class Suma
    {
    public static void main(String[] args)
{
 int total = 0;

 // total de los enteros pares del 2 al 20
 for (int numero = 2; numero <= 20; numero += 2)
 total += numero;

 System.out.printf(“La suma es %d%n”, total);
 }
     } // fin de la clase Suma
}