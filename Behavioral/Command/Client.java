package Command;

import Command.command.TurnACOnCommand;
import Command.invoker.MyRemoteControl;
import Command.receiver.AirConditioner;

public class Client {
    public static void main(String[] args){
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remoteControl = new MyRemoteControl();

        remoteControl.setCommand(new TurnACOnCommand(airConditioner));
    
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
