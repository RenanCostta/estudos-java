package application;

import Interfaces.*;

public class Program {
    public static void main(String[] args) {

        Icaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Renan!");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        System.out.println();

        Icaneta caneta2 = new Giz();
        caneta2.escrever("Olá renan");
        caneta2.escreverComumATodas();
        System.out.println(caneta2.getCor());

        System.out.println();

        Icaneta caneta3 = new Lapis();
        caneta3.escrever("Olá renan");
        caneta3.escreverComumATodas();
        System.out.println(caneta3.getCor());

        System.out.println();

        Icarro veiculo = new CarroPasseio();
        veiculo.andar();
        veiculo.parar();

        System.out.println();

        Icarro veiculo2 = new Caminhão();
        veiculo2.andar();
        veiculo2.parar();
    }
}
