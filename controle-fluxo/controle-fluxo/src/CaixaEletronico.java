public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo =50.0;
        double valorSolicitado = 40.0;
        if (valorSolicitado < saldo) {
            saldo = saldo -valorSolicitado;
        //n mais de uma instrução usando condicionais é obrigatório uso de {} para blocos
            System.out.println("novo saldo " + saldo);
        } else 
            System.out.println("Saldo insuficiente");    
        
        
    }
    
}
