
package clases;


public class NaveAtAt extends Naves{

     public NaveAtAt(int cantidadPersonas, double consumoLP, int cantidadDeNaves, double cantidadParsec) {
        super(cantidadPersonas, consumoLP, cantidadDeNaves,cantidadParsec);
    }
     
     public void calcularConsumoRecorrido(){
       super.calcularConsumoRecorido();
       consumoR=consumoR-(consumoR*0.1);
   }
   
    public double getConsumoRecorrido(){
        calcularConsumoRecorido();
        return consumoR;
    }

    @Override
    public String toString() {
        return  " cantidadPersonas " + cantidadPersonas + ", cantidad de naves " 
                + cantidadDeNaves + ", consumo total " + getConsumoRecorrido() ;
    }
    

    }
    
    
    
}
