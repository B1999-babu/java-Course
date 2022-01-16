package Client;

import Inventory.InventoryManager;

public class Application {
	
	public static void main(String atgs[]) throws InterruptedException {
	
	InventoryManager manager=new InventoryManager();
	

	Thread inventoryTask=new Thread(new Runnable() {

		@Override
		public void run() {
			manager.populateSoldProduct();
		}
	});
	
	Thread displayTask=new Thread(new Runnable() {

		@Override
		public void run() {
			manager.displaySoldProduct();
		}
	});
	
	inventoryTask.start();
	inventoryTask.join();
	displayTask.start();
	
	
}
}
