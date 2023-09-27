package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Coffeeshop {
	
	
  List<Product>	 products = new ArrayList<>();
  
  scanner Input = new scanner(system.in);
  public void setupProduct()  {
	  Product coffee = new Product();
	  coffee.setName("Coffee");
	  coffee.setPrice(5.99);
	  
	  products.add(coffee);
	  
	  Product tea = new Product();
	  tea.setName("tea");
	  tea.setPrice(3.99);
	  
	  
	  products.add(tea);
	  
	  Product cookie = new Product();
	  cookie.setName("cookie");
	  cookie.setPrice(6.99);
	  products.add(cookie);
	  
	  Product donut = new Product();
	  donut.setName("chocolate donut");
	  donut.setPrice(1.99);
	  products.add(donut);
	  
	  
	  
	  
	  PrintALLProducts();
	  
//	  printproduct(coffee);
//	  printproduct(tea);
//	  printproduct(cookie);
	  
	  
  }
	  
	  public void printProduct(Product product) {
	  
	  
	  
	  
	  System.out.println("Product name : " + product.getName() + "Price :" + product.getPrice());
	  
		  
  }
	
	  public void PrintALLProducts() {
		  for (Product product : products) {
			  printProduct(product);
		  }
	  }


	// TODO Auto-generated method stub
	




public static void main (String[] args) {
	Coffeeshop cf = new Coffeeshop();
    cf.setupProduct();
//		value is price of each product
	 double coffee = 5.99;
	 double tea = 3.99;
	 double cookie = 6.99;
	 double subtotal= 0;
	 
//	 3 item of 1st product
	 subtotal = coffee*3;
	 
//	 4 item of 2nd product
	 subtotal = (subtotal + tea*4);
	
	 
	 
	 // 2 items of 3rd product
	 
	 subtotal =(subtotal + cookie*2);
	 DecimalFormat df = new DecimalFormat("#,##0.00");
	 
	
	System.out.println("subtotal ;=" + df.format(subtotal));
	
	double salestax = subtotal * .10;
	System.out.println("salestax : = " + df.format(salestax));
	
	double totalsale = subtotal + salestax;
	
	System.out.println("Total   : " + df.format(totalsale));
}
	
	public int userselect() {
	System.out.print("1) Print the menu items and prices");
	System.out.println("2) Add an item to your order ");
	System.out.println("3) Print the items in your order ");
	System.out.println("4) checkout");
	System.out.println("\n what do you want to do");
	
	int select = Input.nextInt();
	return select;
	
	public static void main(String [] args) {
	 Coffeeshop cf = new Coffeeshop();
	 cf.setupProducts();
	 
	 
	 int userSelection = cf.displayMainUserMenu();
	 if ( userSelection == 1 ) {
		 cf.printAllProducts();
		 
		 int userSelection = cf.displayMainUserMenu();
		 
		 
	 
	 
			
		}
		
	}
		
	}
	
	
			
	
	

	
	
	
	
	
	
			
	 
	 

	
	 
	 
			 
	 
	 
	 
 }
}
