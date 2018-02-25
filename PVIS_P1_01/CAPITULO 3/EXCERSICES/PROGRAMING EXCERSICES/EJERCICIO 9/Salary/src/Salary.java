
import java.util.Scanner;

public class Salary {
    private Integer hora;
    private Integer paga;
    public void setHora(Integer h) {
        hora = h;
    }
    public Integer getHora() {
        return hora;
    }
    public void setPaga(Integer p) {
        paga = p;
    }
    public Integer getPaga() {
        return paga;
    }
    public Integer operacion() {
        Integer resul = hora*paga;
        return resul;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Salary x=new Salary();
        System.out.println("Ingrese las horas trabajadas: ");
        x.setHora(entrada.nextInt());
        System.out.println("Ingrese el pago por hora: ");
        x.setPaga(entrada.nextInt());
        System.out.println("La cantidad que le corresponde es de: " + x.operacion()+" Pesos");
    }
}
