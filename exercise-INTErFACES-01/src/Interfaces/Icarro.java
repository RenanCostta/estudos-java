package Interfaces;

public interface Icarro {

    default void parar(){
        System.out.println("Veículo está freiando...");
    }

    default void andar(){
        System.out.println("Veículo está freiando");
    }
}
