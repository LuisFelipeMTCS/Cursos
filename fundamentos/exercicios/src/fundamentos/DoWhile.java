package fundamentos;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String texto = "";
        do{
            System.out.println("Você precisa falar as palavras magicas...");
            System.out.println("Quer sair ?");
            texto = scan.nextLine();
        }while(!texto.equalsIgnoreCase("Por Favor"));
        
        System.out.println("Obrigado!!");
        scan.close();
    }
}
