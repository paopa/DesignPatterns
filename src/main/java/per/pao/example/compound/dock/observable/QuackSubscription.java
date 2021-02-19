package per.pao.example.compound.dock.observable;

import java.util.concurrent.Flow;

public interface QuackSubscription {
    void registerSubscriber(Flow.Subscriber<?> subscriber);

    void notifySubscribers();
}
