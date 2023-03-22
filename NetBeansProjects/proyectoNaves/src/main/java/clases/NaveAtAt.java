package clases;

public class NaveAtAt extends Naves {

    private double consumo;

    public NaveAtAt(int cantidadPersonas, double consumoLP, int cantidadDeNaves, double cantidadParsec) {
        super(cantidadPersonas, consumoLP, cantidadDeNaves, cantidadParsec);
    }

    public double getConsumoRecorrido() {
        consumo = super.getConsumoRecorido();
        consumo = consumo - (0.25 * consumo);
        Naves.calConsumoT(consumo);
        return consumo;
    }

    
    @Override
    public String toString() {
        return " Cantidad personas " + getCantidadPersonas() + ", cantidad de naves "
                + getCantidadDeNaves() + ", consumo total " + getConsumoRecorrido();
    }

}
