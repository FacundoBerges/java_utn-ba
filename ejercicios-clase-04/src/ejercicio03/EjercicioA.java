package ejercicio03;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*

Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
resultados deben estar en el archivo de salida


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
public class EjercicioA {

    public static void main(String[] args) {
        boolean toEncode;
        byte displace;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese cantidad a desplazar: ");
        displace = Byte.parseByte(scanner.nextLine());


        System.out.print("\t01. Codificar\n\t02. Decodificar\nIngrese opcion: ");
        toEncode = (Integer.parseInt(scanner.nextLine())) == 1;


        try {
            saveFile(toEncode, displace, Path.of("./src/ejercicio03/input.txt"), Path.of("./src/ejercicio03/output.txt"));
            System.out.println("Archivo guardado correctamente.");
        }
        catch (IOException e) {
            System.out.println("Error al guardar archivo.");
        }

    }

    private static boolean saveFile(boolean encode, byte displaceQty, Path inputFile, Path outputFile)
            throws IOException {
        List<String> lines = Files.readAllLines(inputFile);

        if(encode) {
            for (String line : lines) {
                ByteBuffer encoded = StandardCharsets.UTF_8.encode(line.toLowerCase());

                System.out.println(line);
                System.out.println(encoded);

                Files.write(outputFile, encoded.array());
            }
        }
        else {
            for (String line : lines) {
                CharBuffer decoded = StandardCharsets.UTF_8.decode( ByteBuffer.wrap( line.getBytes() ) );

                System.out.println(line);
                System.out.println(decoded);

                Files.writeString(outputFile, new String( displace( line.getBytes(), displaceQty ) ) );
            }
        }

        return true;
    }


    private static byte[] displace(byte[] toDisplace, byte displaceQuantity) {
        byte[] displacedString = new byte[toDisplace.length];
        String text = new String(toDisplace);

        for (int i = 0; i < text.length(); i++){
            toDisplace[i] += displaceQuantity;

            if(text.charAt(i) == ' '){
                toDisplace[i] += 64;
            }

            if(toDisplace[i] > 122){
                if(displaceQuantity == 1){
                    toDisplace[i] = 32;
                }
                else {
                    toDisplace[i] -= 25;
                }
            }
        }

        return displacedString;
    }


}








