
package clases;


public abstract class Naves {
    
    private int cantidadPersonas;
    private double consumoLP;
    private int cantidadDeNaves;
    private double cantidadParsec;
    private double totalLitros;
    private double consumoR;
    int p=5;
    
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
        return  " cantidadPersonas " + cantidadPersonas + ", cantidad de naves " 
                + cantidadDeNaves + ", consumo total " + getConsumoRecorido() ;
    }
    
    
    
    
    
    
    
}
