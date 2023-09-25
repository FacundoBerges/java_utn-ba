import java.util.Scanner;

/*

1. Vamos a practicar operaciones básicas con números

a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.

    Su código puede arrancar (por ejemplo):
        int numeroInicio = 5;
        int numeroFin = 14;

        Se deberían mostrar los números: 5,6,7,8,9,10,11,12,13,14

b. A lo anterior, solo muestre los números pares
c. A lo anterior, con una variable extra, elija si se deben mostrar los números
    pares o impares
d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden

*/

public class Ejercicio01 {

    public static void main(String[] args) {
        int numeroInicio;
        int numeroFin;
        int respuesta;
        boolean mostrarNumerosPares;
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese un numero: ");
        numeroInicio = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese otro numero: ");
        numeroFin = Integer.parseInt(sc.nextLine());

        if (numeroInicio > numeroFin) {
            int aux = numeroInicio;
            numeroInicio = numeroFin;
            numeroFin = aux;
        }



        System.out.println("\n--------------------------------------------------------------------------");

        // Ejercicio A
        System.out.println("Numeros entre los numeros ingresados:");

        int contador = numeroInicio;

        while (contador <= numeroFin){
            System.out.print(contador + " ");
            contador++;
        }


        // Ejercicio B
        System.out.println("\n\nNumeros pares entre los numeros ingresados:");

        contador = numeroInicio;

        while (contador <= numeroFin){
            if(esPar(contador)) {
                System.out.print(contador + " ");
                contador += 2;
            }
            else {
                contador++;
            }
        }

        System.out.println();

        // Ejercicio C
        do {
            System.out.println();
            System.out.println();
            System.out.println("\t1. Pares");
            System.out.println("\t2. Impares");
            System.out.print("\nDesea mostrar numeros pares o impares? Ingrese la opcion correspondiente (1 o 2): ");
            respuesta = Integer.parseInt(sc.nextLine());
        } while (respuesta != 1 && respuesta != 2);

        mostrarNumerosPares = (respuesta == 1);

        System.out.println("\n\nMostrar numeros pares = " + mostrarNumerosPares + ":");

        contador = numeroInicio;

        while (contador <= numeroFin){
            if(( ! esPar(contador) && ! mostrarNumerosPares) ||
                 (esPar(contador) && mostrarNumerosPares) ) {
                System.out.print(contador + " ");
                contador += 2;
            }
            else {
                contador++;
            }
        }


        // Ejercicio D

        System.out.println("\n\nNumeros pares en orden invertido entre los numeros ingresados:");

        for(int i = numeroFin; i >= numeroInicio; i--) {
            if( esPar(i) ) {
                System.out.print(i + " ");
            }
        }


        System.out.println();
    }

    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

}