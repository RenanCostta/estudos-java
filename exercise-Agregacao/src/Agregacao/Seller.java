package Agregacao;

public class Seller {
    private String name;
    private Double commission;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }


    public void sells() {
        System.out.println("Sells!");
    }
}
