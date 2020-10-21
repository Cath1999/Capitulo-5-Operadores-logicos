import java.util.Scanner;
4
5 public class CalificacionesLetra
6 {
7 public static void main(String[] args)
8 {
    int total = 0; // suma de calificaciones
10 int contadorCalif = 0; // número de calificaciones introducidas
11 int aCuenta = 0; // cuenta de calificaciones A
12 int bCuenta = 0; // cuenta de calificaciones B
13 int cCuenta = 0; // cuenta de calificaciones C
14 int dCuenta = 0; // cuenta de calificaciones D
15 int fCuenta = 0; // cuenta de calificaciones F
16
17 Scanner entrada = new Scanner(System.in);
18
19 System.out.printf(“%s%n%s%n %s%n %s%n”,
20 “Introduzca las calificaciones en el rango de 0-100.”,
21 “Escriba el indicador de fin de archivo para terminar la entrada:”,
22 “En UNIX/Linux/Mac OS X escriba <Ctrl> d y oprima Intro”,
23 “En Windows escriba <Ctrl> z y oprima Intro”);
24
25 // itera hasta que el usuario introduzca el indicador de fin de archivo
26 while (entrada.hasNext())
27 {
28 int calificacion = entrada.nextInt(); // lee calificacion
29 total += calificacion; // suma calificacion al total
30 ++contadorCalif; // incrementa el número de calificaciones
31
32 // incrementa el contador de calificación de letra apropiado
33 switch (calificacion / 10)
34 {
35 case 9: // calificacion estaba entre 90
36 case 10: // y 100, inclusive
37 ++aCuenta;
38 break; // sale del switch
39
40 case 8: // calificacion estaba entre 80 y 89
41 ++bCuenta;
42 break; // sale del switch
43
44 case 7: // calificacion estaba entre 70 y 79
45 ++cCuenta;
46 break; // sale del switch
47
48 case 6: // calificacion estaba entre 60 y 69
49 ++dCuenta;
50 break; // sale del switch
51
52 default: // calificacion era menor que 60
53 ++fCuenta;
54 break; // opcional; sale del switch de todas formas
55 } // fin de switch
56 } // fin de while
57
58 // muestra reporte de calificaciones
59 System.out.printf(“%nReporte de calificaciones:%n”);
60
61 // si el usuario introdujo al menos una calificación...
62 if (contadorCalif != 0)
    
    
}