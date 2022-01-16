package Inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

	List<Product> soldProductList=new ArrayList<Product>();
	List<Product> purchagtedProductList=new ArrayList<Product>();
	
	
	public void populateSoldProduct() {
		for(int i=0; i<100; i++) {
			Product pr=new Product(i,"Test_Product_"+i);
	        soldProductList.add(pr);
			System.out.println("ADDED :"+pr);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public void displaySoldProduct() {
		for(Product product:soldProductList) {
         System.out.println("PRINTING THE SOLD: "+product);
         try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}
}
