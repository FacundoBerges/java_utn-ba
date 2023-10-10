import domain.Carrito;
import domain.DescuentoFijo;
import domain.ItemCarrito;
import domain.Producto;
import files.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Producto p1 = new Producto(9, "Harina");
        Producto p2 = new Producto(12, "Pollo");
        Producto p3 = new Producto(5, "Tomate");

        ItemCarrito i1 = new ItemCarrito(2, p1);
        ItemCarrito i2 = new ItemCarrito(1, p2);
        ItemCarrito i3 = new ItemCarrito(3, p3);

        ItemCarrito[] itemsCarrito = {i1, i2, i3};

        Carrito carrito = new Carrito(12, itemsCarrito);
        Utils.showCart(carrito);

        System.out.println();
        System.out.println("Carrito desde archivo: ");
        try {
            ItemCarrito[] items2 = Utils.readFromFile(Path.of("./src/files/carrito.csv"));

            Carrito carrito2 = new Carrito(15, items2);

            Utils.showCart(carrito2);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

}