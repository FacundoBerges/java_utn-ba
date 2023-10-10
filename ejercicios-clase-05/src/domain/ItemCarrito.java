package domain;

public class ItemCarrito {

    private int cantidad;
    private Producto producto;

    public ItemCarrito(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int precio(){
        return producto.getPrecio() * cantidad;
    }


    @Override
    public String toString() {
        return "\t" + cantidad + "\t\t" + producto;
    }


}
