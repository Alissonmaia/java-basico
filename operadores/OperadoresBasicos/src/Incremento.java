public class Incremento {

    public static void main(String[] args) {
        
        int numero = 5;
        //repetição
        numero++; //numero = numero + 1
        //Mesmo valor na memória
        System.out.println(numero ++);
        //Atualizou valor na memória 
        System.out.println(numero);
        //Atualizar no início valor memória
        System.out.println(++ numero);

        //Decrementar

        System.out.println(numero --);

        System.out.println(numero);

        //Boleanos
        boolean variavel = true;
        //Inverter o valor lógico em memória
        System.out.println(!variavel);

        System.out.println(variavel);
        //Inverter o valor da variável do tipo boleano
        variavel = !variavel;

        System.out.println(variavel);
    }

}