package exercicios.src.fundamentos;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma cor e tente a sorte");
        String valor = scan.nextLine();   
        switch(valor.toLowerCase()){
            case "branco":
                System.out.println("Cor Branca");
                break;
            case "azul":case "rosa":
                System.out.println("Cor azul ou rosa");
                break;
            
            case "amarelo":case "verde":
                System.out.println("Cor amarela ou Verde");
                break;
            
            default:
                System.out.println("Nenhuma das cores mencionada");
            scan.close();

                
        System.out.println("FIM");


        }
    }
}
