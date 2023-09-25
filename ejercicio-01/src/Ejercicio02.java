import java.util.Scanner;

/*
Dado el siguiente texto, vamos a atacar el siguiente problema:
    “determinar si una persona pertenece al segmento de ingresos altos”.
Del i al iii, la idea es hacerlo en papel y lápiz y sólo implementar el cuarto.

    “Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
    todas y todos los convivientes:
        ● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
            (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
        ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
        ● Tener 3 o más inmuebles.
        ● Poseer una embarcación, una aeronave de lujo o ser titular de activos
            societarios que demuestren capacidad económica plena.”

a. Lea atentamente el texto, primero que nada piense cuáles son las variables de
    entrada.
b. Ordene las entradas y salidas como vimos en la tabla del ejemplo Monotributo
    en clase, también puede consultar este link
c. Piense en un arbol de decision, también como se vio en clase si puede resolver
    el problema, dadas las entradas
Finalmente, vea si puede resolver el problema utilizando código Java. Por
ejemplo si estuviésemos intentando resolver el ejemplo de monotributo
tendríamos el código que se muestra más abajo, y cambiando las variables

float ingresos = 299000;
int superficie = 20;
int energia = 900;

*********************************************
if ( (ingresos <= 748382.07) &&
        ( superficie <= 30) &&
        (energia <= 3330) ) {
    System.out.println("Categoría A");
}
else if((ingresos <= 1112459.83) &&
        (superficie <= 45) &&
        (energia <= 5000) ) {
    System.out.println("Categoría B");
}
 */
public class Ejercicio02 {
    private static final double MAX_INGRESOS = 489083;
    private static final int MAX_VEHICULOS_5_ANIOS = 3;
    private static final int MAX_INMUEBLES = 3;


    public static void main(String[] args) {
        double ingresosHogar;
        int cantidadVehiculos;
        int cantidadInmuebles;
        int respuesta;
        boolean demuestraCapacidadEconomicaPlena;

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        System.out.print("Ingrese total de ingresos mensuales del hogar: ");
        ingresosHogar = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese cantidad de vehiculos con antiguedad menor a 5 años: ");
        cantidadVehiculos = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese cantidad de inmuebles: ");
        cantidadInmuebles = Integer.parseInt(sc.nextLine());

        do {
            System.out.println("Posee una embarcación, aeronave de lujo o es titular de activos societarios que demuestran capacidad económica plena?");
            System.out.println("\t1. si");
            System.out.println("\t2. no");
            System.out.print("Ingrese una opcion (1 o 2): ");
            respuesta = Integer.parseInt(sc.nextLine());
        } while (respuesta != 1 && respuesta != 2);

        demuestraCapacidadEconomicaPlena = respuesta == 1;

        sb.append("Usted ");

        if(     ingresosHogar < MAX_INGRESOS &&
                cantidadVehiculos < MAX_VEHICULOS_5_ANIOS &&
                cantidadInmuebles < MAX_INMUEBLES &&
                ! demuestraCapacidadEconomicaPlena ) {

            sb.append("NO ");
        }

        sb.append("pertenece al segmento de ingresos altos.");

        System.out.printf("\n%s", sb);

    }



}
