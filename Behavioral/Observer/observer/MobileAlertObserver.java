package Observer.observer;

import Observer.observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String mobileNumber;
    StocksObservable observable;

    public MobileAlertObserver(String mobileNumber, StocksObservable observable){
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }

    @Override
    public void update(){
        System.out.println("Mobile Message sent to "+ mobileNumber);
    }
}
