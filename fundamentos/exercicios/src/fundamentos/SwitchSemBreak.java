package fundamentos;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "preta";
        switch(faixa.toLowerCase()){
        case "preta":
                System.out.println("Faixa Preta");
            break;
        case "marrom":
                System.out.println("Faixa marrom");
        case "verde":
                System.out.println("Faixa Verde");
        case "roxa":
                System.out.println("Faixa Roxa");
        case "vermelha":
        case "amarela":
                System.out.println("Faixa Amarela");
        case "branca":
                System.out.println("Faixa Branca");
        default:
                System.out.println("Nenuma");

        }
    }
    
}
