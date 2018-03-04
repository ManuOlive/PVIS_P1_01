public class Billing {
    public Double computeBill(){
        Double precio = 50*0.08;
        return precio;
    }
    public Double computeBill2(){
        Double precio = (50*2)*0.08;
        return precio;
    }
    public static void main(String[] args){
        Billing x = new Billing();
        System.out.println("El precio es $50");
        System.out.println("El precio con el 8% es: "+"$"+x.computeBill());
        System.out.println("El precio es $50");
        System.out.println("Son dos fotografias y el precio con el 8% es: "+"$"+x.computeBill2());
    }
}
