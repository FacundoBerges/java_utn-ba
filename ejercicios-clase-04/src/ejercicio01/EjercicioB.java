package ejercicio01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
Haga lo mismo, pero solicitando los parámetros de a uno por consola
 */
public class EjercicioB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char orderDescending;
        int numA, numB, numC;
        int[] numbers;

        numA = getNumber("\nIngrese un numero: ");
        numB = getNumber("\nIngrese otro numero: ");
        numC = getNumber("\nIngrese un tercer numero: ");

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
