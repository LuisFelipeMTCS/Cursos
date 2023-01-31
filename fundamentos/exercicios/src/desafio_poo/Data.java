package desafio_poo;


public class Data {
    String dia;
    String mes; 
    String ano; 
    String dataBr(){
        String data_formatada = dia + "/" + mes + "/" + ano;
        return data_formatada;
    }
    String dataBr(String dia1,String mes1,String ano1){
        String data_formatada = dia1 + "/" + mes1 + "/" + ano1;
        return data_formatada;
    }
}
