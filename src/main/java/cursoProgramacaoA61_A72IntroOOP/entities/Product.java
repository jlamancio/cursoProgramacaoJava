package cursoProgramacaoA61_A72IntroOOP.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(){ }

    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public double totalValueInStock(){
        return price * quantity;
    }

    public void addproducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + " ,  $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f%n",totalValueInStock());
    }

}
