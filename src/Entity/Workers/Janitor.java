package Entity.Workers;

import Entity.Buildings.Aviary;

public class Janitor extends Worker {

    public Aviary aviary;
    @Override
    public void doSomeWork() {
        aviary.setAviaryClean(true);
    }

}
