package shopping;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    
    ArrayList<Product> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
     

   
    public boolean Remove(Product product)
    {
        return list.remove(product);
        

    }
    public boolean UpdateQuantity(int id,Product product,int quantity)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).id==id)
            {
              list.get(i).quantity=quantity; 
              list.get(i).price+=product.price; 
              return true;
            }
        }
        return false;
        
    


    }
    public boolean UpdateQuantity(Product product,int a)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).name==product.name)
            {
              list.get(i).quantity+=a;
              list.get(i).price=product.quantity*product.price; 
              return true;
            }
        }
        return false;
        
    


    }
    public double Totalprice()
    {
        double total=0;
        for(int i=0;i<list.size();i++)
        {
            
           total=total+list.get(i).getPrice();

        }
        System.out.println("Total price :"+total);
        return total;
    }
    public void Content()
    {
        System.out.println("Cart contains :");
        for(int i=0;i<list.size();i++)
        {
            System.out.println((i+1)+"."+" "+list.get(i).getName()+"  "+"Quantity : "+list.get(i).getQuantity());
        }
    }
    public void AddToCart(Product product)
    {
        if(!list.contains(product))
        {
            System.out.println("How many "+product);
            int a=sc.nextInt();
            product.quantity=a;
            product.price=product.quantity*product.price;
        list.add(product);
    }
    else if(list.contains(product))
    {
    System.out.println("How many "+product);
            int a=sc.nextInt();
           UpdateQuantity(product, a);
    
    }
    }
}
