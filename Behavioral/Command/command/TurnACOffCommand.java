package Command.command;

import Command.receiver.AirConditioner;

class TurnACOffCommand implements ICommand{

    AirConditioner ac;

    TurnACOffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        ac.turnOnAC();
    }

    @Override
    public void undo(){
        ac.turnOffAC();
    }
}