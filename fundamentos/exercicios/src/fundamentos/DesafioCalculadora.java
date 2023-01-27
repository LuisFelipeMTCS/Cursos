package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
        public static void main(String[] args) {
            double result;
            String valor1 = JOptionPane.showInputDialog("Numero 1");
            int numero1 = Integer.parseInt(valor1);
            String valor2 = JOptionPane.showInputDialog("Numero 1");
            int numero2 = Integer.parseInt(valor2);
            String valor3 = JOptionPane.showInputDialog("Digite o operador: ");

            if (valor3.equalsIgnoreCase("-")){
                result = numero1 - numero2;
                System.out.println(result);

            }
            else if(valor3.equalsIgnoreCase("+")){
                result = numero1 + numero2;
                System.out.println(result);


            }
            else if(valor3.equalsIgnoreCase("/")){
                result = numero1 / numero2;
                System.out.println(result);


            }
            else if(valor3.equalsIgnoreCase("*")){
                result = numero1 * numero2;
                System.out.println(result);


            }
            else {
                System.out.println("Numero não encontrado!");
            }










            

        }
    
    
}
