package Observer.observer;

import Observer.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String email;
    StocksObservable observable;


    public EmailAlertObserver(String email, StocksObservable observable){
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update(){
        System.out.println("Email Message sent to " + email);
    }
}
