package entities;

public class Comissionado extends Empregado {
    private double totalVenda;
    private double taxaComissao;

    public Comissionado(){

    }

    public Comissionado(double totalVenda, double taxaComissao) {
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    public Comissionado(String name, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
        super(name, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public Double vencimento() {
        return totalVenda * taxaComissao;
    }


}
