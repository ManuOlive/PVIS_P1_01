
import java.util.Scanner;

public class SammysRentalPriceWithMethods {

    private Integer hora;

    public void setHora(Integer e) {
        hora = e;
    }

    public Integer getInvitados() {
        return hora;
    }

    public Integer operacion() {
        Integer resul = hora * 40;
        return resul;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SammysRentalPriceWithMethods x = new  SammysRentalPriceWithMethods();
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("    S\tSAMMY’S MAKES IT IN THE SUN. S");
        System.out.println("    SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ingresa las horas: ");
        x.setHora(entrada.nextInt());
        System.out.println("El precio es de: "+x.operacion()+" Pesos");
    }
}
