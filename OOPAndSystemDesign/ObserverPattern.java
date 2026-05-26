// OBSERVER PATTERN
// Defines one-to-many dependency between objects

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class EventManager {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class EmailObserver implements Observer {
    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Email to " + email + ": " + message);
    }
}

class SMSObserver implements Observer {
    private String phone;

    public SMSObserver(String phone) {
        this.phone = phone;
    }

    @Override
    public void update(String message) {
        System.out.println("SMS to " + phone + ": " + message);
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        EmailObserver emailObserver = new EmailObserver("user@example.com");
        SMSObserver smsObserver = new SMSObserver("1234567890");

        eventManager.subscribe(emailObserver);
        eventManager.subscribe(smsObserver);

        eventManager.notifyAllObservers("New event occurred!");
    }
}
