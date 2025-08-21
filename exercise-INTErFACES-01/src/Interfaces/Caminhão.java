package Interfaces;

public class Caminhão implements Icarro{

    @Override
    public void andar() {
        System.out.println("Veículo está andando devagar");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão está parando");
    }
}
