package Creational.Factory;


abstract class Vehicle{
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle{
    public void printVehicle(){
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle{
    public void printVehicle(){
        System.out.println("I am four wheeler");
    }
}


class Client{
    public Vehicle vehicle;

    public Client(int type){
        if(type ==1){
            vehicle = new FourWheeler();
        }else if(type == 2){
            vehicle = new TwoWheeler();
        }else{
            vehicle = null;
        }
    }

    public void cleanUp(){
        if(vehicle!= null){
            vehicle = null;
        }
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}

public class factory {
    public static void main(String[] args){
        Client client = new Client(1);
        Vehicle pVehicle = client.getVehicle();
        if(pVehicle!=null){
            pVehicle.printVehicle();
        }
        client.cleanUp();
    }
}
