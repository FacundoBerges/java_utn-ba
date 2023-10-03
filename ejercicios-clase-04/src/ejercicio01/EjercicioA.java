package ejercicio01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Haga un main, donde por parámetro ponga 3 números y una letra que
represente ascendente o descendente y los muestre ordenados por tal criterio.
 */
public class EjercicioA {

    public static void main(String[] args) {
        char orderDescending = 'b';
        int numA = 5, numB = 3, numC = 4;
        int[] numbers;

        System.out.printf("\nNumeros: %d, %d, %d\n", numA, numB, numC);

        numbers = orderBy(numA, numB, numC, orderDescending);
        System.out.printf("\nArray ordenado de forma %s: %s\n", (orderDescending == 'b' ? "descendente" : "ascendente"), Arrays.toString(numbers));
    }


    private static int[] orderBy(int first, int second, int third, char descending){
        Integer[] integers = {first, second, third};
        int[] orderedNumbers = new int[integers.length];
        int count = 0;

        if( descending == 'b' ){
            Arrays.sort(integers, Collections.reverseOrder());
        }
        else {
            Arrays.sort(integers);
        }

        for (Integer num : integers) {
            orderedNumbers[count] = num;
            count++;
        }

        return orderedNumbers;
    }
}
