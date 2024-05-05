public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero =1; numero <=5; numero ++){
            //Condicional
            if (numero == 3)
                continue; //Eliminar a interação verdadeira
                //break; parada execução
                System.out.println(numero);
        }
    }//Qual a saída ?
}
