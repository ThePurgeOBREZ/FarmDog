package Service;

import Entity.Buildings.TrainingCenter;
import Entity.Dogs.AdultDog;
import Entity.Dogs.Dog;
import Entity.Dogs.OldDog;
import Entity.Dogs.Puppy;
import Entity.Workers.Janitor;
import Entity.Workers.Vet;

public class DaySimulation {

    private TrainingCenter trainingCenter;
    private Janitor janitor;
    private Vet vet;
    private Dog dog;
    private AdultDog betty = new AdultDog(6, "Betty");
    private AdultDog mus = new AdultDog(5, "Mus");
    private OldDog oldDog = new OldDog(9, "Ben");
    private Puppy puppy = new Puppy(1, "fluffy");

    public void MorningBreakfast() {

        System.out.println("Доброе утро! Все собаки идут на кормёжку");
        if (Dog.isDogHungry()) {
            Dog.setDogHungry(false);
        };
    }

    public void VetCheck(){
        System.out.println("Ветеринар осматривает собак");
        vet.doSomeWork();
        }

    public void Cleaning(){
        System.out.println("уборщик чистит вольер");
        janitor.doSomeWork();
    }

    public void Training(){
        System.out.println("Происходит дрессировка щенков");
        trainingCenter.TrainPuppy();
    }

    public void Work(){
        System.out.println("Собаку" + betty.getName() + "отвели на работу в полицию");
        betty.WorkInPolice();
        System.out.println("Собаку" + mus.getName() + "отвели на работу в пожарную");
        betty.WorkInFireDepartment();
        Dog.setDogHungry(true);
    }

    public void EveningMeal() {
        System.out.println("Вечерняя кормёжка");
        if (Dog.isDogHungry()) {
            Dog.setDogHungry(false);
        }
    }
}


