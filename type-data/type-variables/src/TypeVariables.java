public class TypeVariables {
    public static void main(String[] args) throws Exception {
       
       String meuNome = "Alissonmaia";
       int anoFabricacao;          //tipo <int>, nome <anoFabricacao>, com valor padrão zero
       double salarioMinimo =2500; //tipo <double>, nome <salarioMinimo> do tipo milhar e diferente 2.500 decimal
       double salario = 1450.33;
       byte idade = 110;
       short ano =2021;
       //Tipos long terminar com L e Tipo Float terminar com F
       int cep = 21070333;      //se começar com zero, iniciar com outro tipo
       long cpf = 98765432109L; //se começar com zero, iniciar com outro tipo
       float pi = 3.14F;

       // add cast tipo mais abrangente converter para tipo mais específico 
       short numeroCurto =1;
       int numeroNormal = numeroCurto;
       short numeroCurto2 = (short) numeroCurto;
       //Passando outro valores para memoria
       int numero = 1;
       numero =2;

       
    }
}
