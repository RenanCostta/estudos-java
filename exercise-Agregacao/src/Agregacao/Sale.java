package Agregacao;
import java.util.List;

public class Sale {
    private List<Produto> product;
    private Seller seller;
    private Buyer buyer;


    public List<Produto> getProduct() {
        return product;
    }

    public void add(Produto product){
        this.product.add(product);
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }


    public void makeSales() {
        System.out.println("Buyer " + this.buyer.getName());
        System.out.println("bought the items: ");
        for (Produto prod : this.product) {
            System.out.println("Product´s name: " + prod.getName() + " Product´s value: " + prod.getPrice());
        }
        System.out.println("Seller: " + this.seller.getName());

    }

    public void cancelSales() {
        System.out.println("Sale canceled");
    }

    @Override
    public String toString() {
        return "Sale{" +
                "product=" + product +
                ", seller=" + seller +
                ", buyer=" + buyer +
                '}';
    }
}
