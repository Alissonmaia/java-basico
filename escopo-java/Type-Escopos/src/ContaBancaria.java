//Escopo de Classe

public class ContaBancaria {
    //Variável da classe conta
    double  saldo = 10.0;
    
    public void sacar (double valor) {
            //Várivael local do método
            double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo (){

        //disponível em toda classe
        System.out.println(saldo);

        //Variável somente disponível método sacar
        System.out.println(novoSaldo);

    }
    public double calcularDividaExponencial (){
           //variavel local de método
           double valorParcela = 50.0;
           double valorMontante = 0.0;  //começando a variável com valor zer
           for (int x = 1; x <=5; x++){ // X é variável de escopo fluxo
                   //está variável será iniciada a cada execução
                   double valorCalculado = valorParcela * x;//Variável valorCalculado é escopo de fluxo
                   valorMontante = valorMontante + valorCalculado;

           }//escopo de fluxo
            // X e valorCalculado nunca estarão disponível fora do laço for
            return valorMontante;
    }
}
