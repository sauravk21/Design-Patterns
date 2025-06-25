package Creational.Singleton;


class Singleton{
    private static Singleton singleton_instance = null;
    
    private Singleton(){
        System.out.println("Making Singleton object");
    }

    public static synchronized Singleton getIntance(){
        if(singleton_instance == null){
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }
}


public class Main {
    public static void main(String args[]){

        Singleton a = Singleton.getIntance();
        Singleton b = Singleton.getIntance();
        
        Singleton c = Singleton.getIntance();

        System.out.println(a.hashCode()+" "+b.hashCode()+" "+c.hashCode());
        
    }
}
