package exercicios.controle;

import java.io.File;
import java.util.Scanner;

public class testeif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = entrada.nextDouble();
        System.out.println(nota);
        boolean criterioAprovacao = nota > 7;
        entrada.close();
        if(criterioAprovacao){
            System.out.println("Aprovado!");
        }
        else if(nota < 7 && nota <= 5){
            System.out.println("Reprovado!");
        }
        else{
            System.out.println("na média!");
        }


    }
    
}
