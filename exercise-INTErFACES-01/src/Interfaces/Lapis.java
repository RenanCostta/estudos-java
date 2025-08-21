package Interfaces;

public class Lapis implements Icaneta{
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " Na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Preto";
    }
}
