package domain;

public class DescuentoPorcentaje extends Descuento{

    private Double porcentaje;

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public int descuento(int base) {
        return (int) (base * 100 / porcentaje);
    }



}
