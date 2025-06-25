package state;

import java.util.ArrayList;
import java.util.List;

import state.VendingStates.state;
import state.VendingStates.impl.IdleState;


public class VendingMachine {
    private state vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public state getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(state vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

}
