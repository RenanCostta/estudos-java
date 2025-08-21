package Interfaces;

public class CarroPasseio implements Icarro{

    @Override
    public void andar() {
        System.out.println("Carro está andando rápido");
    }

    @Override
    public void parar() {
        System.out.println("Carro está freiando");
    }
}
