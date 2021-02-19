package per.pao.example.compound.duck.observer;

public interface Observer {
    void update(QuackObservable duck);

    class Quackologist implements Observer {

        @Override
        public void update(QuackObservable duck) {
            System.out.printf("\nQuackologist: %s just quacked.\n", duck);
        }
    }
}