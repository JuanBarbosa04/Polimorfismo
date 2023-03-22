
package clases;

public class NaveSupremacy extends Naves{

    private int cantPersonas;
    private int cantLitrosPorParsec;
    private int cantNaves;
    
    public NaveSupremacy() {
    }

    public NaveSupremacy(int cantPersonas, int cantLitrosPorParsec, int cantNaves) {
        this.cantPersonas = cantPersonas;
        this.cantLitrosPorParsec = cantLitrosPorParsec;
        this.cantNaves = cantNaves;
    }

    int numero1 = 10/100*cantLitrosPorParsec;
    
    @Override
    public int consumoEnLtsPorParsec(int cantLitrosPorParsec) {
        return this.cantLitrosPorParsec = cantLitrosPorParsec+numero1;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getCantLitrosPorParsec() {
        return cantLitrosPorParsec;
    }

    public void setCantLitrosPorParsec(int cantLitrosPorParsec) {
        this.cantLitrosPorParsec = consumoEnLtsPorParsec(cantLitrosPorParsec);
    }

    public int getCantNaves() {
        return cantNaves;
    }

    public void setCantNaves(int cantNaves) {
        this.cantNaves = cantNaves;
    }

    @Override
    public String toString() {
        return "Cantidad personas: " + numero1 + ", Litros por parsec: " + cantLitrosPorParsec + ", Cantidad naves: " + cantNaves;
    }
    
    
    
    
}
