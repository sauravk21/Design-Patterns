package ChainofResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    
    DebugLogProcessor debugLogProcessor;
    ErrorLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }
    
    public void log(int logLevel,String message){
        if(logLevel == ERROR){
            System.out.println("ERROR: "+message);
        }else{
            super.log(logLevel, message);
        }
    }
}
