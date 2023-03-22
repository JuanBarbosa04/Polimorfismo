
package clases;


public abstract class Naves {
    
    protected int cantidadPersonas;
    protected double consumoLP;
    protected int cantidadDeNaves;
    protected double cantidadParsec;
    private double totalLitros;
    protected double consumoR;

    public Naves(int cantidadPersonas, double consumoLP, int cantidadDeNaves, double cantidadParsec) {
        this.cantidadPersonas = cantidadPersonas;
        this.consumoLP = consumoLP;
        this.cantidadDeNaves = cantidadDeNaves;
        this.cantidadParsec = cantidadParsec;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double getConsumoLP() {
        return consumoLP;
    }

    public void setConsumoLP(double consumoLP) {
        this.consumoLP = consumoLP;
    }

    public int getCantidadDeNaves() {
        return cantidadDeNaves;
    }

    public void setCantidadDeNaves(int cantidadDeNaves) {
        this.cantidadDeNaves = cantidadDeNaves;
    }
    
    public void totalLitros(){
        totalLitros+=consumoLP;
    }
    
    public double getTotalLitros(){
        return totalLitros;
    }
    
    public void calcularConsumoRecorido(){
        this.consumoR= cantidadDeNaves*consumoLP*cantidadParsec;   
    }
    
    public double getConsumoRecorido(){
        calcularConsumoRecorido();
        return consumoR;
    }
    
    @Override
    public String toString() {
        return "Naves{" + "cantidadPersonas=" + cantidadPersonas + ", cantidadLitrosP=" 
                + consumoLP + ", cantidadDeNaves=" + cantidadDeNaves + '}';
    }
    
    
    
    
    
    
    
}
