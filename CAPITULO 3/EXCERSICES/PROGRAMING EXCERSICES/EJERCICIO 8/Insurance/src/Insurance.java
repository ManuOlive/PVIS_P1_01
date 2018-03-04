
import java.util.Scanner;

public class Insurance {
    private Integer edad;
    public void setEdad(Integer e) {
        edad = e;
    }
    public Integer getEdad() {
        return edad;
    }
    public Integer operacion() {
        Integer resul = ((Math.abs(edad/10)+15)*20);
        return resul;
    }
        public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Insurance x=new Insurance();
        System.out.println("Ingrese la edad del trabajador: ");
        x.setEdad(entrada.nextInt());
        System.out.println("La cantidad que le corresponde es de: " + x.operacion()+" Pesos");
    }
}
