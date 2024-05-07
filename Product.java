package shopping;
public class Product{

    int id;
    String name="";
    double price=0;
    int quantity=0;

    Product(int id,String name,double price,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    String getName()
    {
        return this.name;

    }
    int getQuantity(){
        return this.quantity;
    }
    double getPrice()
    {
        return this.price;
    }
}

