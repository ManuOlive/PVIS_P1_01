
import java.util.Scanner;

public class Event {
    private Integer invitados;
    public void setInvitados(Integer e) {
        invitados = e;
    }
    public Integer getInvitados() {
        return invitados;
    }
    public Integer operacion() {
        Integer resul = invitados*35;
        return resul;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Event x=new Event();
        System.out.println("    ****************************************************");
        System.out.println("    *\tCarly’s makes the food that makes it a party.  *");
        System.out.println("    ****************************************************");
        System.out.println("Ingrese la cantidad de invitados: ");
        x.setInvitados(entrada.nextInt());
        if (x.getInvitados()>=50){
            System.out.println("¡¡¡Fiesta Grande!!!");
            System.out.println("El precio es de: " + x.operacion()+" Pesos");
        }else{
            System.out.println("¡¡¡Fiesta Pequeña!!!");
            System.out.println("El precio es de: " + x.operacion()+" Pesos");
        }
    }
}
