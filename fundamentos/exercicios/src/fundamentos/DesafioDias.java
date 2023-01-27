package exercicios.src.fundamentos;

import javax.swing.JOptionPane;

public class DesafioDias {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Dia:");
        if(valor.equals("DOMINGO")){
            System.out.println("7");
        }
        else if(valor.toUpperCase().equals("SABADO")){
            System.out.println("6");
        }
        else if(valor.toUpperCase().equals("SEXTA")){
            System.out.println("5");
        }
        else if(valor.toUpperCase().equals("QUINTA")){
            System.out.println("4");
        }
        else if(valor.toUpperCase().equals("QUARTA")){
            System.out.println("3");
        }
        else if(valor.toUpperCase().equals("TERÇA")){
            System.out.println("2");
        }
        else if(valor.toUpperCase().equals("SEGUNDA")){
            System.out.println("1");
        }
        else{
            System.out.println("Numero invalido!");
        }
    }
}
