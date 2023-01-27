package exercicios.src.fundamentos;

public class SwitchComBreak {
    public static void main(String[] args) {
        String branco = "branco";
        switch(branco.toLowerCase()){
            case "branco":
                System.out.println("Cor Branca");
                break;
            case "azul":
                System.out.println("Cor azul");
                break;
            case "rosa":
                System.out.println("Cor rosa");
                break;
            case "amarelo":
                System.out.println("Cor amarelo");
                break;
            case "verde":
                System.out.println("Cor amarelo");
                break;
            default:
                System.out.println("Nenhuma das cores mencionada");            


        }
    }
}
