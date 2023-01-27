package exercicios.src.fundamentos;

public class SwitchComBreak {
    public static void main(String[] args) {
        String branco = "azul";
        switch(branco.toLowerCase()){
            case "branco":
                System.out.println("Cor Branca");
                break;
            case "azul":case "rosa":
                System.out.println("Cor azul e rosa");
                break;
            
            case "amarelo":case "verde":
                System.out.println("Cor amarela e Verde");
                break;
            

            default:
                System.out.println("Nenhuma das cores mencionada");
                
        System.out.println("FIM");


        }
    }
}
