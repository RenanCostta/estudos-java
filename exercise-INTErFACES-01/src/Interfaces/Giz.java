package Interfaces;

public class Giz implements Icaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o Valor " + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
