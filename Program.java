package Vendas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);


        try {
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.println("Dados da compra.");
        System.out.print("Nome do produto: ");
        String nome_produto = sc.nextLine();

        System.out.print("Quantidade: ");
        int qtd_produto = sc.nextInt();
        sc.nextLine();

        System.out.print("Preço: ");
        double price = sc.nextDouble();

        System.out.print("Digite a data da compra: ");
        Date data_compra = sdf.parse(sc.next());

        Product product = new Product(nome,idade,nome_produto, qtd_produto, price, data_compra);
        System.out.println();
        System.out.println(product);

        }
        catch (ParseException e){
            System.out.println("Formato de data inválido");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}
