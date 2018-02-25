
import java.util.Scanner;

public class GasPrices {
    private Double galon;
    private Double barril;
    
    public void setGalon(Double g) {
        galon = g;
    }

    public Double getGalon() {
        return galon;
    }
    public void setBarril(Double b) {
        barril = b;
    }

    public Double getBarril() {
        return barril;
    }
    public Double pricePerGalon() {
        Double resul = galon * 4;
        return resul;
    }
    public Double pricePerBarrel() {
        Double resul = barril * 100;
        return resul;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        GasPrices x=new GasPrices();
        System.out.println("Ingresa el numero de galones: ");
        x.setGalon(entrada.nextDouble());
        System.out.println("El precio es: "+x.pricePerGalon());
        System.out.println("Ingresa el numero de barriles: ");
        x.setBarril(entrada.nextDouble());
        System.out.println("El precio es: "+x.pricePerBarrel());
    }
}
