package VendingMachinePackage;

import java.util.List;

public class VendingMachine {
	NoCoinInsertedState noCoinInsertedState = new NoCoinInsertedState(this);
	CoinInsertedState coinInsertedState = new CoinInsertedState(this);
	DispensingState dispensingState = new DispensingState(this);
	state machineState = null;
	int loadedAmount = 0;
	Inventory inventory;
	
	public VendingMachine() {
		machineState = noCoinInsertedState;
		inventory.addProduct(List<Product> products);
	}

	public NoCoinInsertedState getNoCoinInsertedState() {
		return noCoinInsertedState;
	}

	public void setNoCoinInsertedState(NoCoinInsertedState noCoinInsertedState) {
		this.noCoinInsertedState = noCoinInsertedState;
	}

	public CoinInsertedState getCoinInsertedState() {
		return coinInsertedState;
	}

	public void setCoinInsertedState(CoinInsertedState coinInsertedState) {
		this.coinInsertedState = coinInsertedState;
	}

	public DispensingState getDispensingState() {
		return dispensingState;
	}

	public void setDispensingState(DispensingState dispensingState) {
		this.dispensingState = dispensingState;
	}

	public state getMachineState() {
		return machineState;
	}

	public void setMachineState(state machineState) {
		this.machineState = machineState;
	}

	public int getLoadedAmount() {
		return loadedAmount;
	}

	public void setLoadedAmount(int loadedAmount) {
		this.loadedAmount = loadedAmount;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	
}
