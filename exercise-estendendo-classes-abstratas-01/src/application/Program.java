package application;

import entities.Assalariado;
import entities.Comissionado;
import entities.Empregado;
import entities.Horista;



public class Program {
    public static void main(String[] args) {


        Assalariado empregado = new Assalariado();
        empregado.setCpf("19152034739");
        empregado.setName("Renan");
        empregado.setSobrenome("Silva");
        empregado.setSalario(2000.00);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("08138778000");
        comissionado.setName("jairo");
        comissionado.setSobrenome("bolso");
        comissionado.setTotalVenda(35000);
        comissionado.setTaxaComissao(0.15);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setName("Nicolas");
        horista.setCpf("000.000.000-00");
        horista.setSobrenome("Matheus");
        horista.setPrecoHora(40.0);
        horista.setHorasTrabalhadas(54.0);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        System.out.println("Nome: " + empregado.getName()
                + " Sobrenome: "
                + empregado.getSobrenome()
                + " CPF: " + empregado.getCpf()
                + " Vencimentos: " + empregado.vencimento());
    }

}
