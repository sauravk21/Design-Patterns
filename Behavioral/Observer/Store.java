package Observer;

import Observer.observable.IphoneObservable;
import Observer.observable.StocksObservable;
import Observer.observer.EmailAlertObserver;
import Observer.observer.MobileAlertObserver;
import Observer.observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){

        StocksObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserver("adityaprajapati@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("adityaprajapati@gmail.com", iphoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserver("adityaprajapati@gmail.com", iphoneObservable);
        MobileAlertObserver observer4 = new MobileAlertObserver("8340713614", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.add(observer4);

        iphoneObservable.setStockCount(10);
    }
}
