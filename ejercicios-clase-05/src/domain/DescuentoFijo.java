package domain;

public class DescuentoFijo extends Descuento {

    private int monto;

    public DescuentoFijo(int monto) {
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public int descuento(int base) {
        return base - monto;
    }
}
