public class Methods {
    public static void main (String [] args){
    /** Corpo principal */    
        String primeiroNome = "Alisson";
        String segundoNome = "maia";

        /** Variável chamada próprio método com parâmetro */
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        /** Print concatenação nome completo */
        System.out.println(nomeCompleto);

    }

    /** Inicio do Método retornar um texto*/
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        /** Corpo de retorno método */
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }    

}
