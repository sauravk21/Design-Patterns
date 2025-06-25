package ChainofResponsibility;

public class DebugLogProcessor extends LogProcessor{
    
    DebugLogProcessor debugLogProcessor;
    DebugLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }
    
    public void log(int logLevel,String message){
        if(logLevel == DEBUG){
            System.out.println("ERROR: "+message);
        }else{
            super.log(logLevel, message);
        }
    }
}
