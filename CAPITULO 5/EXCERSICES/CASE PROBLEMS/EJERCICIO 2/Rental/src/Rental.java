
import java.util.Scanner;

public class Rental {
    private Integer hora;

    public void setHora(Integer e) {
        hora = e;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer operacion() {
        Integer resul = hora * 40;
        return resul;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Rental x = new  Rental();
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("    S\tSAMMY’S MAKES IT IN THE SUN. S");
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ingresa las horas: ");
        x.setHora(entrada.nextInt());
        
        int contador=0;System.out.println("El precio es de: "+x.operacion()+" Pesos");
        for(int i=0;i<x.getHora();i++){
            System.out.println("Cupon valido por 10% de descuento en su proxima visita");
            contador=contador+1;
        }
        System.out.println("Total de cupones: "+contador);
    }
}
