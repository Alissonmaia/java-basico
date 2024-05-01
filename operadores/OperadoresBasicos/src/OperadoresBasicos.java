public class OperadoresBasicos {
    public static void main(String[] args) throws Exception {
        //Operador de atribuição
        String nome = "Alisson";          //Valor textual
        int idade = 26;                   //Valor Numeral
        double peso = 59.5;               //Valor Decimal
        char sexo = 'M';                  //valor único
        boolean doadorOrgao = true;       //Valor lógico
        Date dataNascimento = new Date(); //classes que representar tipos de variáveis <new> <classe> 
        
        //Operadores aritmeticos 
        double soma = 10.5 + 15.7;
        int subtracao = 100 - 50;
        int multiplicacao = 20 * 2;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10*7) +(20/4);
        //concatenação de textos com <+>
        String nomeCompleto = "LINGUAGEM " + " JAVA";
        System.out.println(nomeCompleto);
    }
}
