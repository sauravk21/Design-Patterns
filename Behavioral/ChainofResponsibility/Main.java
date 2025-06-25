package ChainofResponsibility;

public class Main {
    public static void main(String args[]){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        
        logProcessor.log(LogProcessor.ERROR,"error happened");
    
        logProcessor.log(LogProcessor.DEBUG, "Let's debug this");


        logProcessor.log(LogProcessor.INFO, "code ending");
    }
}
