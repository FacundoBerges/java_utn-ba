package domain;

public class Producto {

    private int precio;
    private String nombre;

    public Producto(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return "\t" + precio + "\t\t\t\t" + nombre ;
    }

}
