import java.util.Scanner;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void abaixarVolume(){
        volume--;
    }

    public void alterarCanalMais(){
        canal++;
    }

    public void alterarCanalMenos(){
        canal--;
    }

    public void alterarCanalPara(int novoCanal){
        Scanner input = new Scanner(System.in);
        System.out.print("Qual canal?: ");
        novoCanal = input.nextInt();
        canal = novoCanal;
    }
}