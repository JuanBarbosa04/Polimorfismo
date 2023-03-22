
package clases;

public class NaveSupremacy extends Naves{
    
    private double consumo;

   public NaveSupremacy(int cantidadPersonas, double consumoLP, int cantidadDeNaves, double cantidadParsec) {
        super(cantidadPersonas, consumoLP, cantidadDeNaves,cantidadParsec);
    }
   
   
    public double getConsumoRecorrido(){
        consumo=super.getConsumoRecorido();
        consumo=consumo+(0.1*consumo);
        Naves.calConsumoT(consumo);
        return consumo;
    }
   
    @Override
    public String toString() {
        return  " Cantidad personas " + getCantidadPersonas() + ", cantidad de naves " 
                + getCantidadDeNaves() + ", consumo total " + getConsumoRecorrido() ;
    }
    
   }
    
    
    

