package VendingMachinePackage;

public class DispensingState implements state{
	VendingMachine vendingMachine;

	public DispensingState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public Product dispense() {
		// TODO Auto-generated method stub
		vendingMachine.getProductAt(aisleNumber);
		vendingMachine.setState(vendingMachine.getNoCoinInsertedState());
	}

	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
	    throw new MachineException("Please wait while product is dispensing");
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		throw new MachineException("Please wait while product is dispensing");
	}
	
	
}
