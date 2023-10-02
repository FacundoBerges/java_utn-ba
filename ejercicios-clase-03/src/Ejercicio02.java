import java.util.Arrays;
import java.util.Scanner;

/*
Genere una clase que tenga los métodos para realizar la codificación y decodificación
de un string, dado un número de desplazamientos.
    ● Por ejemplo, con desplazo de 1:
        “hola que tal” -> “ipmbarvfaubm”
        h -> i
        o -> p
    ● con desplazo de 2:
        “hola que tal” -> “jqncbswgbvcn”
        h -> j
        o -> q

En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
Para este ejercicio puede usar todos los métodos de String,
tanto de instancia (por ejemplo length) como de clase,
por ejemplo String.valueOf(arr) # donde arr es un char[]. Tenga a mano los javadocs del mismo
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        byte displace;
        byte[] codified;

        System.out.print("Ingrese un texto a codificar: ");
        text = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese cantidad a desplazar: ");
        displace = Byte.parseByte(scanner.nextLine());

        codified = text.getBytes();

        for (int i = 0; i < text.length(); i++){
            codified[i] += displace;

            if(text.charAt(i) == ' '){
                codified[i] += 64;
            }

            if(codified[i] > 122){
                if(displace == 1){
                    codified[i] = 32;
                }
                else {
                    codified[i] -= 25;
                }
            }
        }

        System.out.printf("\nTexto desplazado: %s\n", new String(codified));

    }

}
