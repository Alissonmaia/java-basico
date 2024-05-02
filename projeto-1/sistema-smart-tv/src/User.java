//Classe User
public class User {
    public static void main(String[] args){
        //Classe SmartTv <Variavél smartTV> Novo Objeto new SmartTV
        SmartTv smartTv = new SmartTv();
        //Manipulação do método volume 
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        //Mostre antes de mudar o canal
        System.out.println("Canal Atual : " + smartTv.canal);
        //Passar novo valor 
        smartTv.mudarCanal(13);
        //Mostre depois de mudar o canal
        System.out.println("Canal Atual : " + smartTv.canal);
        //Mostre o volume Atual
        System.out.println("Volume Atual : " + smartTv.volume);
        
        //Mostre o Estado Atual da smartTv   
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        //Chamada do métodos Ligar e desligar
        smartTv.ligar();
            System.out.println("Status -> TV ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Status -> TV desligada " + smartTv.ligada);
        
    }
}
