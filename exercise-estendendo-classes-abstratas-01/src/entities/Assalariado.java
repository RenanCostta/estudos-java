package entities;

public class Assalariado extends Empregado {
    private Double salario;


    public Assalariado(){

    }

    public Assalariado(Double salario) {
        this.salario = salario;
    }

    public Assalariado(String name, String sobrenome, String cpf, Double salario) {
        super(name, sobrenome, cpf);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double vencimento() {
        return salario;
    }

}
