package Entity.Workers;

import Entity.Dogs.Dog;

public class Vet extends Worker {

    public Dog dog;

    private final int age = 30;

    @Override
    public void doSomeWork() {
        Dog.setDogHealthy(true);
    }
}
