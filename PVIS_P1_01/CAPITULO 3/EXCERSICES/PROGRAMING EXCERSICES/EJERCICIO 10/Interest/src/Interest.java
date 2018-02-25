
import java.util.Scanner;

public class Interest {
    private Double dinero;
    public void setDinero(Double d){
        dinero=d;
    }
    public Double getDinero() {
        return dinero;
    }
    public Double operacion() {
        Double resul = dinero * 0.05;
        return resul;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Interest x=new Interest();
        System.out.println("Ingrese la cantidad de dinero: ");
        x.setDinero(entrada.nextDouble());
        System.out.println("La cantidad en la que incrementara al 5% es de : " + x.operacion()+" Pesos");
    }
}
