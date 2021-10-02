package AulaArray;

public class Data {
    public static int getDia(String data){
        //"12/12/2021""12"
        String teste=data.substring(3,2);
        int dia = Integer.parseInt(data.substring(0,1));
        return dia;
    }
    public static int getMes(String data){
        int mes = Integer.parseInt(data.substring(3,5));
        return mes;
    }
    public static int getAno(String data){
        int ano = Integer.parseInt(data.substring(6,10));
        return ano;
    }
}
