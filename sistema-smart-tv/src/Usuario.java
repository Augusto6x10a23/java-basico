public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Tv Ligada?: " + smartTv.ligada);
        System.out.println("Qual canal?: " + smartTv.canal);
        System.out.println("Qual o volume?: " + smartTv.volume);

        smartTv.ligar();
        smartTv.alterarCanalMais();
        smartTv.aumentarVolume();

        System.out.println("\nNovo status: Tv Ligada?: " + smartTv.ligada);
        System.out.println("Novo status: Qual canal?: " + smartTv.canal);
        System.out.println("Novo status: Qual o volume?: " + smartTv.volume);

        smartTv.alterarCanalPara(0);

        System.out.println(smartTv.canal);

    }
}
