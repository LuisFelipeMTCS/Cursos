package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Desafio1 {
   public static void main(String[] args) {
    String valor1 = JOptionPane.showInputDialog("Digite seu ultimo salario: ");
    String valor2 = JOptionPane.showInputDialog("Digite seu ultimo salario: ");
    String valor3 = JOptionPane.showInputDialog("Digite seu ultimo salario: ");

    
    // Scanner entrada = new Scanner(System.in);
    // System.out.println("Ultimos salarios: ");
    // String print1 = entrada.nextLine();
    // System.out.println("Ultimos salarios: ");
    // String print2 = entrada.nextLine();
    // System.out.println("Ultimos salarios: ");
    // String print3 = entrada.nextLine();
    int teste1 = Integer.parseInt(valor1);
    int teste2 = Integer.parseInt(valor2);
    int teste3 = Integer.parseInt(valor3);
    System.out.println((teste1 + teste2 + teste3)/3);

    } 
}
