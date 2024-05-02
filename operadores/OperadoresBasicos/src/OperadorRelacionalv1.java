public class OperadorRelacionalv1 {

    public static void main(String[] args) {
            //Operadores == | != | < | > | 
            //Relacionando Classes
            String nomeUm = "Alisson";
            String nomeDois = new String ("Alisson");
            //Dois objetos na memória 
            System.out.println(nomeUm == nomeDois);
            //Comparar conteúdo dos objetos função equals
            System.out.println(nomeUm.equals(nomeDois));
    }

}