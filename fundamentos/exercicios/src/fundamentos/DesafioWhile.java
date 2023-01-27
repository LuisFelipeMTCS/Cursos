package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cont1 = 0;
        int cont2 = 0;
        String text = "";

        while(!text.equalsIgnoreCase("-1")){
            System.out.println("Digite sua nota ou -1 para sair: ");
            text = scan.nextLine();
            double num  = Double.parseDouble(text);
            if(num >= 5.5){
                cont1 += num;
                cont2+=1;
            }
            else if(text.equalsIgnoreCase("-1")){
                System.out.println("media:" + cont1/cont2);
            }
            else{
                System.out.println("Nota invalida");
            }
        }

        
        scan.close();
        
    }
    
}
