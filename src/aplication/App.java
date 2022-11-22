package aplication;
 // import java.util.*; 
import java.util.Locale;
import java.util.Scanner;

//importação com a classe Product
import entities.Product; 

public class App {
  
  /**
     * @param args
     * @throws Exception
     */
    
     public static void main(String[] args) throws Exception {

    
     Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

// ler os dados e depois instaciar o produto 
    
    System.out.println("Enter product data: ");
    System.out.print("Name: ");
  
 //variável aux para receber o nome digitado: String, double, int)
    String name = sc.nextLine();
    System.out.print("Price: ");
    double price = sc.nextDouble();
//Chamada do construtor com apenas dois parâmetros 
    Product product = new Product(name, price);

/*Alteração do nome do produto com atributos privados 
 (encapsulamento - private)*/

 product.setName("Computer");

 //Impressão do nome atualizado (metodo get) 

 System.out.println("Updated name: " + product.getName());
    
    System.out.println();
    System.out.println("Product data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be added in stock: ");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);

    System.out.println();
    System.out.print("Enter the number of products to be removed from stock: "); 
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated data: " + product);



  sc.close();
 }


}



    

    
        
        
        
       