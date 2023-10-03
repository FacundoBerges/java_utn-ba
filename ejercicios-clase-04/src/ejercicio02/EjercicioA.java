package ejercicio02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjercicioA {

    public static void main(String[] args) {
        int totalSum = sumNumbersFromFile("./src/ejercicio02/numbers.txt");

        System.out.printf("\nLa suma de los numeros en el archivo da como total %d\n", totalSum);
    }

    private static int sumNumbersFromFile(String path){
        List<String> fileLines = readFile(Paths.get(path));
        int total = 0;

        if (fileLines != null) {
            for (String line : fileLines) {
                total += Integer.parseInt(line);
            }
        }

        return total;
    }

    private static List<String> readFile(Path filePath){
        List<String> lines = null;

        try {
            if(Files.exists(filePath)){
                lines = Files.readAllLines(filePath);
            }
            else {
                System.out.println("El archivo solicitado no existe.");
            }
        }
        catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
        finally {
            return lines;
        }
    }

}
