package files;

import domain.Carrito;
import domain.DescuentoFijo;
import domain.ItemCarrito;
import domain.Producto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Utils {

    public static ItemCarrito[] readFromFile(Path filePath) throws IOException {
        List<String> lines = Files.readAllLines(filePath);
        ItemCarrito[] items = new ItemCarrito[lines.size()];

        if(lines != null && ! lines.isEmpty()){
            for (int i = 0; i < lines.size(); i++) {
                String[] data = lines.get(i).split(",");

                int cantidad = Integer.parseInt(data[0].replaceAll("\\D+", ""));
                int precio = Integer.parseInt(data[1]);
                String nombreProducto = data[2].trim();

                Producto p = new Producto(precio, nombreProducto);
                ItemCarrito itemCarrito = new ItemCarrito(cantidad, p);

                items[i] = itemCarrito;
            }
        }


        return items;
    }

    public static void showCart(Carrito cart) {
        System.out.println("\tCantidad\tPrecio Unitario\t\tProducto");

        for (ItemCarrito item : cart.getItems()) {
            System.out.println("\t" + item.toString());
        }

        System.out.println("Total del carrito: $ " + cart.precio(new DescuentoFijo(0)));
    }

}
