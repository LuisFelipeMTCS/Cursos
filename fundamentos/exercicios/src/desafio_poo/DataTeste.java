package desafio_poo;

public class DataTeste {
    public static void main(String[] args) {
        Data dt = new Data();
        dt.ano = "2023";
        dt.mes = "02";
        dt.dia = "27";

        Data dt2 = new Data();
        dt2.ano = "2023";
        dt2.mes = "02";
        dt2.dia = "27";

        System.out.printf("%s/%s/%s\n",dt.dia,dt.mes,dt.ano);
        System.out.printf("%s/%s/%s",dt2.dia,dt2.mes,dt2.ano);

    }
}
