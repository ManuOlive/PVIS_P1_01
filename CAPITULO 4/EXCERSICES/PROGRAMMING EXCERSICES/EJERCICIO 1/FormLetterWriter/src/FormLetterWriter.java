public class FormLetterWriter {
   //String str= "Manuel"; 
   public String displaySalutation(){
       String primern = "Olive";
       return primern;
   }
   public String displaySalutation2(){
       String primern = "Olive";
       String segunn= "Manuel";
       return primern + " " + segunn;
   }
   public static void main(String[] args){
       FormLetterWriter x = new FormLetterWriter();
       System.out.println("Querido: "+ x.displaySalutation());
       System.out.println("Querido: "+x.displaySalutation2());
       System.out.println("Gracias por su compra");
   }
    
}
