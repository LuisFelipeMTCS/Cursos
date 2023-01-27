package exercicios.src.fundamentos;

public class BreakModulado {
    public static void main(String[] args) {
        
      
       externo: for(int i = 0; i < 10; i++){
          for(int j = 0; j < 10;j++){
                if(i==5){
                    break externo ;

                }
            System.out.printf("[%d %d]",i,j);

            }
        }

    }
    
}
