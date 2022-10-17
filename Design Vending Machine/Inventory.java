package VendingMachinePackage;

import java.util.Map;
import java.util.Stack;

public class Inventory {
	Map<Product, Integer> productCountMap;
	Map<Integer, Product> aisleProductMap;
	Stack<Integer> availableAisle;
	
	void addProduct(Product p){
		if (productCountMap.containsKey(p)) {
			productCountMap.put(p,productCountMap.getOrDefault(p, 0)+1);
		}
		else {
			if(!availableAisle.isEmpty()) {
				int aisleNumber = stack.pop();
			}
			else {
				throw new MachineException("No aisle to add new product");
			
			aisleProductMap.put(aisleNumber, product);
			productCountMap.put(p, 1);
			}
		}
		
	}
	
}
