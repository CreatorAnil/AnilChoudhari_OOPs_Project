package VendingMachinePackage;

public class NoCoinInsertedState implements state{
	VendingMachine vendingMachine;
	
	public NoCoinInsertedState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public Product dispense() {
		// TODO Auto-generated method stub
		throw new MachineException("No coin inseted");
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		machine.setAmount();
		machine.setState(machine.getCoinInsertedState());
		
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		throw new MachineException("No coin inserted");
		
	}

}
