package Command.invoker;

import java.util.Stack;
import Command.command.ICommand;

public class MyRemoteControl {
    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    public MyRemoteControl(){
    }

    public void setCommand(ICommand command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
        acCommandHistory.add(command);
    }

    public void undo(){
        if(!acCommandHistory.isEmpty()){
            ICommand lasCommand = acCommandHistory.pop();
            lasCommand.undo();
        }
    }
}
