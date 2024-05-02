//Classe SmartTv
public class SmartTv {
    //Atributos estado inicial SmartTv
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    //método mudarCanal com parâmetro novoCanal
    //User informe o canal desejado
    public void mudarCanal (int novoCanal ){
        canal = novoCanal;
    }
    //Método aumenrar Canal
    public void aumentarCanal () {
        canal++;
    }
    //Método Diminuir Canal
    public void diminiuirCanal(){
        canal--;
    }

    //Métodos de manipulação dos estados da SmartTv
    public void ligar () {
        ligada=true;
    }
    public void desligar () {
         ligada=false;

    }
    //Método volume 
    public void aumentarVolume(){
        //Incremento + 1
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        //volume = volume + 1
        
    }
    //Método volume
    public void diminuirVolume (){
        //decremento volume -1
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
        
        //volume = volume - 1;
    
    }
}
