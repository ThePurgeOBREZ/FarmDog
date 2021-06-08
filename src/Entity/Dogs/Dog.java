package Entity.Dogs;

public class Dog {

    private int age;
    private String name;

    private static boolean isDogHungry = true;
    private static boolean isDogHealthy = false;
    private boolean isDogTrained = false;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isDogHungry() {
        return isDogHungry;
    }

    public static void setDogHungry(boolean dogHungry) {
        isDogHungry = dogHungry;
    }

    public static boolean isDogHealthy() {
        return isDogHealthy;
    }

    public static void setDogHealthy(boolean dogHealthy) {
        isDogHealthy = dogHealthy;
    }

    public boolean isDogTrained() {
        return isDogTrained;
    }

    public void setDogTrained(boolean dogTrained) {
        isDogTrained = dogTrained;
    }
}
