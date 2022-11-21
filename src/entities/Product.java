package entities;

//Criação da classe Product

public class Product {
  
 public String name;
 public double price;
 public int quantity;

 /*  utilização do construtor: não tem o tipo de retorno 
 e executa no momento da instaciação do objeto
 (geralmente depois dos métodos) */

 public Product(String name, double price, int quantity) {
   
//diferenciação atributo do objeto e parâmetro do método construtor 
    this.name = name;
    this.price = price;
    this.quantity = quantity;

 }


 public double totalValueInStock() {
    return price * quantity;
}

 // this: autoreferência para o objeto quantity
  public void addProducts(int quantity) {
    this.quantity += quantity; 
  }

  public void removeProducts(int quantity) {
     this.quantity -= quantity;
  }

/*Conversão dos objetos da classe para string*/ 
public String toString() {
    return name 
    + ", $ "
    + String.format("%.2f", price)
    + ", "
    + quantity
    + " units, Total: $ "
    + String.format("%.2f" , totalValueInStock());

}
}