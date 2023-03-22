
package clases;


public class NaveDestructorEstelar extends Naves{
    
    private int cantPersonas;
    private int cantLitrosPorParsec;
    private int cantNaves;

    public NaveDestructorEstelar() {
    }

    public NaveDestructorEstelar(int cantPersonas, int cantLitrosPorParsec, int cantNaves) {
        this.cantPersonas = cantPersonas;
        this.cantLitrosPorParsec = cantLitrosPorParsec;
        this.cantNaves = cantNaves;
    }

    @Override
    public int consumoEnLtsPorParsec(int cantLitrosPorParsec) {
        return this.cantLitrosPorParsec = cantLitrosPorParsec*1;
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
    return "Cantidad personas: " + cantPersonas + ", Litros por parsec: " + cantLitrosPorParsec + ", Cantidad naves: " + cantNaves;    
    }
    
    
    
    
}
