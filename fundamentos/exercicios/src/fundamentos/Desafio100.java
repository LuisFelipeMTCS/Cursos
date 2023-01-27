package fundamentos;

import javax.swing.JOptionPane;

public class Desafio100 {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("insira sua primeira nota: ");
        String valor2 = JOptionPane.showInputDialog("Digite o valo da segunda nota: ");
        double nota1 = Double.parseDouble(valor1);
        double nota2 = Double.parseDouble(valor2);
        String  resultado = (nota1 + nota2)/2 >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println("O aluno está " + resultado + ",nota " + (nota1+nota2)/2);


    }
    
}
