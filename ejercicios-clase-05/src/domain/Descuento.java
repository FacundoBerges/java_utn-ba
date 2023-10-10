package domain;

import java.time.LocalDate;

public abstract class Descuento {

    protected LocalDate comienzo;
    protected LocalDate fin;

    public LocalDate getComienzo() {
        return comienzo;
    }

    public void setComienzo(LocalDate comienzo) {
        this.comienzo = comienzo;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    abstract int descuento(int base);

}
