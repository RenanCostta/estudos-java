package application;

import Agregacao.Buyer;
import Agregacao.Produto;
import Agregacao.Sale;
import Agregacao.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Produto productTV = criarProduct(1L, 150.0d, "TV");
        Produto productCEL = criarProduct(2L, 350.0d, "Cellphone");
        
        Seller seller01 = criarVendedor("Olavo", 10d);
        Seller seller02 = criarVendedor("sócrates", 10d);
        Seller seller03 = criarVendedor("Hayek", 10d);

        Buyer buyer00 = criarComprador("Renan", 500d);
        Buyer buyer01 = criarComprador("Jully", 500d);

        Sale sale = new Sale();
        sale.setSeller(seller01);
        sale.setBuyer(buyer00);
        sale.add(productTV);
        sale.add(productCEL);

        sale.makeSales();
    }

    private static Buyer criarComprador(String name, Double appropriation) {
        return new Buyer(name, appropriation);
    }

    private static Seller criarVendedor(String name, Double commission) {
        Seller seller = new Seller();
        seller.setName(name);
        seller.setCommission(commission);
        return seller;
    }


    private static Produto criarProduct(Long codOfProduct, Double price, String name) {
        Produto product = new Produto();
        product.setCodeOfProduct(codOfProduct);
        product.setPrice(price);
        product.setName(name);
        return product;
    }
}
