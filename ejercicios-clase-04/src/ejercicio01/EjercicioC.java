package ejercicio01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
si no detecta ninguno. Vea si con una función puede evitar repetir código.
 */
public class EjercicioC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char orderDescending;
        Integer numA = 5, numB = null, numC = null;
        int[] numbers;


        System.out.print("\nComo desea ordenarlos?\n\tA. Ascendente\n\tB. Descendente\nIngrese orden: ");
        orderDescending = scanner.nextLine().toLowerCase().charAt(0);

        numbers = orderBy(numA, numB, numC, orderDescending);
        System.out.printf("\nArray ordenado de forma %s: %s\n", (orderDescending == 'b' ? "descendente" : "ascendente"), Arrays.toString(numbers));
    }

    private static int getNumber(String message){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print(message);
        num = Integer.parseInt(scanner.nextLine());

        return num;
    }


    private static int[] orderBy(Integer first, Integer second, Integer third, char descending){

        if(first == null) {
            first = getNumber("\nIngrese un numero: ");
        }

        if(second == null) {
            second = getNumber("\nIngrese el 2do numero: ");
        }

        if(third == null) {
            third = getNumber("\nIngrese un 3er numero: ");
        }

        Integer[] integers = { first, second, third };
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
