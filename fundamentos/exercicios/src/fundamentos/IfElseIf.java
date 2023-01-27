package exercicios.src.fundamentos;

import java.util.Scanner;

import javax.crypto.spec.DESKeySpec;
import javax.swing.SortingFocusTraversalPolicy;

public class IfElseIf {
    public static void main(String[] args) {
        System.out.println("Digite uma nota de zero a dez");
        Scanner entrada = new Scanner(System.in);
        double nota = entrada.nextDouble();
        if(nota >  10 || nota < 0){
            System.out.println("Nota invalida!");
        }
        else{

            if(nota >= 6){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado!");

            }
        }
        entrada.close();

    }
    
}
