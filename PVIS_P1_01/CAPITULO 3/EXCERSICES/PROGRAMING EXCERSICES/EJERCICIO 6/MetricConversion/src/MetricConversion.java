
import java.util.Scanner;

public class MetricConversion {
    private Double pulgadas;
    private Double galones;
    public void setPulgadas(Double p) {
        pulgadas = p;
    }
    public Double getPulgadas() {
        return pulgadas;
    }
    public void setGalones(Double g) {
        galones = g;
    }
    public Double getGalones() {
        return galones;
    }
    public Double pricePerGalon() {
        Double resul = galones * 3.7854 ;
        return resul;
    }
    public Double pricePerPulgada() {
        Double resul = pulgadas * 2.54;
        return resul;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        MetricConversion x =new MetricConversion();
        System.out.println("Ingresa el numero de galones: ");
        x.setGalones(entrada.nextDouble());
        System.out.println("Los litros son: "+x.pricePerGalon());
        System.out.println("Ingresa el numero de centimetros: ");
        x.setPulgadas(entrada.nextDouble());
        System.out.println("El precio es: "+x.pricePerPulgada());
    }
}
