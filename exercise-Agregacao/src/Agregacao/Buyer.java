package Agregacao;

public class Buyer {
    private String name;
    private Double appropriation;

    public Buyer(String name, Double appropriation) {
        this.name = name;
        this.appropriation = appropriation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAppropriation() {
        return appropriation;
    }

    public void setAppropriation(Double appropriation) {
        this.appropriation = appropriation;
    }


    public void buy() {
        System.out.println("Buy!");
    }
}
