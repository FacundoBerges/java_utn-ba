package domain;

import java.util.Arrays;

public class Carrito {

    private int fecha;
    private ItemCarrito[] items;

    public Carrito(int fecha, ItemCarrito[] items) {
        this.fecha = fecha;
        this.items = items;
    }

    public ItemCarrito[] getItems() {
        return items;
    }

    public int precio(Descuento desc){
        return desc.descuento( totalCarrito() );
    }

    private int totalCarrito() {
        int total = 0;

        for (ItemCarrito item : items) {
            total += item.precio();
        }

        return total;
    }


    @Override
    public String toString() {
        return "Carrito {\n" +
                "fecha=" + fecha +
                ", \nitems=\n" + Arrays.toString(items) +
                "\n}";
    }


}
