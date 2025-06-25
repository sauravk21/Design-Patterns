package state;

public enum Coin {
    PENNY(1),
    NICKEL(2),
    DIME(3),
    QUARTER(25);

    public int value;

    Coin(int value){
        this.value = value;
    }
}
