package entities;

public abstract class Empregado {
    private String name;
    private String sobrenome;
    private String cpf;

    public Empregado(){}

    public Empregado(String name, String sobrenome, String cpf) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract Double vencimento();

}
