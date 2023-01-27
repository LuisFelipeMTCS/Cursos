package exercicios.src.fundamentos;

import java.util.Scanner;

public class desafio6 {

    public static void main(String[] args) {
        
        System.out.println("Digite três numero: ");
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        while(cont < 3){
           
   
            System.out.printf("Digite o numero %d: \n", cont+1);
            int num = sc.nextInt();
            if(num >= 1 && num <= 25 ){
                System.out.println("Adolecente");

            }
            else if(num >= 25 && num <= 50){
                System.out.println("Adulto");

            }
            else{
                System.out.println("Velho");

            }
            cont++;
        }

    }
    
}
