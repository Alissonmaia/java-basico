public class OperadoresRelacionais {

    public static void main(String[] args) {
        //Operadores == | != | < | > | 
        //Relacionando Tetxtos
        String nomeUm = "Alisson";
        String nomeDois = "Alisson";
        System.out.println(nomeUm == nomeDois);
        //Relacionando Números
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual ao numero2 ? " + simNao);

        simNao = numero1 != numero2;
        
        System.out.println("numero1 é diferente ao numero2 ? " + simNao);
        
        simNao = numero1 > numero2;
        System.out.println("numero1 é maior ao numero2 ? " + simNao);
       //Bloco condições 
       if (numero1 < numero2){
           System.out.println(" a condição é verdadeira ");
       }
       if (numero1 == numero2) {
           System.out.println( " a condição é verdadeira ");
           
       } 



    }
    
}
