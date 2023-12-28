package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public  void checkout(String status){
        //logging
        //Authentication & Authorization
        //Sanitize the Data

        System.out.println("Checkout Method from ShoppingCart Called");
    }
}
