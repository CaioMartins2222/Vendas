package Vendas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product extends Cliente {

    private String nameProduct;
    private Integer quantity;

    private Date dataCompra;
    private Double price;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Product(String nome, Integer idade, String nameProduct, Integer quantity, Double price,Date dataCompra) {
        super(nome,idade);

        if(idade < 18){
            throw new Exception("Compra só permitida para maiores de 18 anos. ");
        }

        if(quantity < 1){
            throw new Exception("A quantidade mínima é um.");
        }

        Date now = new Date();
        if(dataCompra.after(now)){
            throw new Exception("Digite uma data de compra válida.");
        }


        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
        this.dataCompra = dataCompra;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double total(){
        double soma;
        return soma = quantity * price;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Idade: " + getIdade() + "\n" +
                "Nome produto: " + nameProduct  + "\n" +
                "Quantidade: " + quantity  + "\n" +
                "Preço: "  + price + "\n" +
                "Data da compra: " + sdf.format(dataCompra)  + "\n" +
                "Total do pedido: R$" + String.format("%.2f",total()) ;


    }
}
