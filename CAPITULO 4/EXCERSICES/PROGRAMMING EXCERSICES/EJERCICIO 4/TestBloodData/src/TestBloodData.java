public class TestBloodData {
    public String tipoSangre(){
       String tipo1 = "O+";
       String tipo2 = "O-";
       String tipo3 = "A+";
       String tipo4 = "A-";
       String tipo5 = "B+";
       String tipo6 = "B-";
       return tipo1+" "+tipo2+" "+tipo3+" "+tipo4+" "+tipo5+" "+tipo6+" ";
    }
    public static void main(String[] args){
        TestBloodData x = new TestBloodData();
        System.out.println("Los tipos de sangre son: "+x.tipoSangre());
    }
}
