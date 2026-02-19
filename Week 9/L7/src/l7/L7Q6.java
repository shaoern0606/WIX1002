package l7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Product {
    private String productID;
    private String productName;
    private double pricePerUnit; 
    
    public Product (String productID, String productName, double pricePerUnit) {
        this.productID = productID;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
    }
    
    public String getProductID(){
        return productID;
    }
    
     public String getProductName(){
        return productName;
    }
    
    public double getPricePerUnit(){
        return pricePerUnit;
    }
}

class Order {
    private String orderID;
    private String productID;
    private int orderQuantity; 
    
    public Order (String orderID, String productID, int orderQuantity) {
        this.orderID = orderID;
        this.productID = productID;
        this.orderQuantity = orderQuantity;
    }
    
    public String getOrderID(){
        return orderID;
    }
    
    public String getProductID(){
        return productID;
    }
    
    public int getOrderQuantity(){
        return orderQuantity;
    }
}

public class L7Q6 {
    public static void main(String[] args) {
        try{
            // read product.txt
            BufferedReader inProduct = new BufferedReader(new FileReader("Lab07/product.txt"));
            
            ArrayList<Product> productList = new ArrayList<>();
            
            String line1;
            while ((line1 = inProduct.readLine()) != null) {
                String[] productLine = line1.split(",");
                Product product = new Product(productLine[0], productLine[1], Double.parseDouble(productLine[2]));
                productList.add(product);
            }
            
            inProduct.close();
            
            // read order.txt
            BufferedReader inOrder = new BufferedReader(new FileReader("Lab07/order.txt"));
            
            ArrayList<Order> orderList = new ArrayList<>();
            
            String line2;
            while ((line2 = inOrder.readLine()) != null) {
                String[] orderLine = line2.split(",");
                Order order = new Order(orderLine[0], orderLine[1], Integer.parseInt(orderLine[2]));
                orderList.add(order);
            }
            
            inOrder.close();
            
            // print output
            System.out.printf("%-12s%-22s%-12s%-15s%-20s%n", "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");
            for (Order o: orderList) {
                String orderProductID = o.getProductID();
                int quantity = o.getOrderQuantity();
                
                for (Product p : productList) {
                    if (p.getProductID().equals(orderProductID)) {
                        double total = p.getPricePerUnit() * quantity;
                        System.out.printf("%-12s%-22s%-12d%-15.2f%-20.2f%n", p.getProductID(), p.getProductName(), quantity, p.getPricePerUnit(), total);   
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
         
    }
}