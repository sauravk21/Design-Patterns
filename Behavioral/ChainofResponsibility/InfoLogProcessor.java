package ChainofResponsibility;

public class InfoLogProcessor extends LogProcessor{
    
    DebugLogProcessor debugLogProcessor;
    InfoLogProcessor(LogProcessor nexLogProcessor){
        super(nexLogProcessor);
    }
    
    public void log(int logLevel,String message){
        if(logLevel == INFO){
            System.out.println("ERROR: "+message);
        }else{
            super.log(logLevel, message);
        }
    }
}
