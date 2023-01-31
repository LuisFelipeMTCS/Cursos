package desafio_poo;

public class DataTeste {
    public static void main(String[] args) {
        Data dt = new Data();
        dt.ano = "2023";
        dt.mes = "02";
        dt.dia = "27";

        Data dt2 = new Data();
        dt2.ano = "2024";
        dt2.mes = "03";
        dt2.dia = "25";

        System.out.printf(dt.dataBr()+ "\n");
        System.out.printf(dt.dataBr(dt2.dia,dt2.mes,dt2.ano));

    }
}
