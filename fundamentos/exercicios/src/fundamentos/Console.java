package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom dia !");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name  = entrada.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome  = entrada.nextLine(); // input()/Scanf()       
        System.out.printf("Nome Completo: %s %s ",name,sobrenome);
        entrada.close(); // fechamos para economizar memoria 
    

    }
    
}
