public class OperadorLogico {
    public static void main(String[] args) {
        //Operadores && e || com boleanos
        boolean condicao1 = true;
        boolean condicao2 = true;
        //Comparar valores lógicos
        if (condicao1 && condicao2) {
            System.out.println( " As duas condições são verdadeiras ");

        }
        if (condicao1 || condicao2) {
            System.out.println(" Uma das condições é verdadeira");
        }
        //Expressão relacional
        if (condicao1 && (7 > 4)) {
            System.out.println( " As duas condições são verdadeiras ");
        }

         System.out.println("FIM");
    }
    
}
