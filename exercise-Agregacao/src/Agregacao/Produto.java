package Agregacao;

public class Produto {
    private String name;
    private Long codeOfProduct;
    private Double price;


    public Long getCodeOfProduct() {
        return codeOfProduct;
    }

    public void setCodeOfProduct(Long codeOfProduct) {
        this.codeOfProduct = codeOfProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public void sold() {
        System.out.println("Sold!");
    }
}
