/*
Utilizando solo tipos primitivos, String (solo usar método length), vectores,
iteraciones simples y condicionales, genere una clase por ejercicio que posea los
siguientes métodos:

    a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        el String
    b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        mismos y los retorne en un vector de 3
    c. dado un vector de números, y un número X, que sume todos los números > X y
        retorne el resultado
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        int QUANTITY = 100;

        boolean orderDescending;
        char character;
        int numA, numB, numC, count = 0, input, number, totalSum;
        int[] numbers;
        int[] vector = new int[QUANTITY];
        Scanner scanner = new Scanner(System.in);
        String text;


        // Ejercicio A
        System.out.print("Ingrese un texto o palabra: ");
        text = scanner.nextLine();

        System.out.print("\nIngrese un caracter a buscar: ");
        character = scanner.nextLine().charAt(0);

        System.out.printf("El caracter '%c' se encuentra %d veces en el texto ingresado.%n", character, countChar(text, character));


        // Ejercicio B
        System.out.print("\nIngrese un numero: ");
        numA = Integer.parseInt(scanner.nextLine());

        System.out.print("\nIngrese otro numero: ");
        numB = Integer.parseInt(scanner.nextLine());

        System.out.print("\nIngrese un tercer numero: ");
        numC = Integer.parseInt(scanner.nextLine());

        System.out.print("\nComo desea ordenarlos?\n\t1. Ascendente\n\t2. Descendente\nIngrese orden: ");
        orderDescending = scanner.nextLine().equals("2");

        numbers = orderBy(numA, numB, numC, orderDescending);
        System.out.printf("\nArray ordenado de forma %s: %s\n", (orderDescending ? "descendente" : "ascendente"), Arrays.toString(numbers));


        // Ejercicio C
        System.out.println();
        do{
            System.out.print("Ingrese un numero, o '-999' para cortar el ingreso de datos: ");
            input = Integer.parseInt(scanner.nextLine());

            if(input != -999) {
                vector[count] = input;
                count++;
            }
        } while (input != -999 && count < QUANTITY);

        if(count > 0){
            System.out.print("Ingrese numero desde el cual realizar la suma de los numeros ingresados: ");
            number = Integer.parseInt(scanner.nextLine());

            totalSum = sumGreaterThan(vector, number);

            System.out.printf("\nLa suma de los numeros mayores a %d da un total de %d.\n", number, totalSum);
        }
        else {
            System.out.println("No se encontraron numeros cargados.");
        }


    }


    private static int countChar(String text, char character){
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.toLowerCase().charAt(i) == Character.toLowerCase(character)){
                count++;
            }
        }

        return count;
    }

    private static int[] orderBy(int first, int second, int third, boolean descending){
        Integer[] integers = {first, second, third};
        int[] orderedNumbers = new int[integers.length];
        int count = 0;

        if( descending ){
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

    private static int sumGreaterThan(int[] numbers, int number){
        int result = 0;

        for (int num : numbers) {
            if (num > number) {
                result += num;
            }
        }

        return result;
    }


}