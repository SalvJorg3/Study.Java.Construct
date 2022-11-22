package entities;

//Criação da classe Product

public class Product {

/*Encapsulamento de atributos 
(programa não pode acessar diretamente os atributos)*/
 private String name;
 private double price;
 private int quantity;

 /*  utilização do construtor: não tem o tipo de retorno 
 e executa no momento da instaciação do objeto
 (geralmente depois dos métodos) */

 public Product(String name, double price, int quantity) {
   
//diferenciação atributo do objeto e parâmetro do método construtor 
    this.name = name;
    this.price = price;
    this.quantity = quantity;

 }

/* Utilização de sobrecarga (outra operação com
o mesmo nome do construtor, porém com uma
 lista de param. diferentes) */ 
public Product(String name, double price) {
   
       this.name = name;
       this.price = price;
   
    }

/* Para permitir que o nome do produto possa ser atualizado
 (por convenção depois dos contrutores)*/

 public void setName(String name) {
    this.name = name;
 }

/*Para permitir que o nome seja obtido */

public String getName(){
   return name;
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