import java.util.ArrayList;
import java.util.List;

public class CarService implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println(" Новый клиент подписан на уведомления.");
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println(" Клиент отписался от уведомлений.");
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }


    public void newPromotion(String promo) {
        System.out.println("\n Новая акция: " + promo);
        notifyObservers("Акция: " + promo);
    }

    public void carReady(String ownerName) {
        System.out.println("\n Машина владельца " + ownerName + " готова!");
        notifyObservers("Автомобиль " + ownerName + " готов к выдаче.");
    }
}
