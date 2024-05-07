/*Vamos criar um exemplo de classe para representar uma SmartTv onde:
 1. ela tenha as caracteristicas: Ligada(boolean), canal(int) e volume(int)
 2- Nossa tv poderá ligar e desligar e assim mudar o estado ligada
 3-nossa tv aumentará e diminuirá o volume sempre em +1 ou -1
 4- Nossa tv poderá mudar de canal de 1 em 1 ou definindo o numero correspondente
 */

public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);


        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);


    }
}
