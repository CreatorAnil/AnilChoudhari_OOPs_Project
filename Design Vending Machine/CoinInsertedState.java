package VendingMachinePackage;

public class CoinInsertedState implements state{
	
	VendingMachine vendingMachine;
	
	public CoinInsertedState(VendingMachine vendingMachine) {
		super();
		this.vendingMachine = vendingMachine;
	}

	@Override
	public Product dispense() {
		// TODO Auto-generated method stub
		throw new MachineException("Button yet to press");
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		throw new MachineException("coin already inserted");
		
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		if(vendingMachine.checkIfProductAvailable(aisleNumber)) {
			vendingMachine.setState(vendingMachine.getDispenseState());
		}
		else {
			throw new MachineException("product not available.")
		}
		
	}

}
